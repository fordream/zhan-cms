package zt.cms.xf.newcms.services;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.event.SelectEvent;
import zt.cms.xf.newcms.controllers.T100103CTL;
import zt.cms.xf.newcms.controllers.T100104CTL;
import zt.cms.xf.newcms.domain.T100103.T100103ResponseRecord;
import zt.cms.xf.newcms.domain.T100104.T100104RequestList;
import zt.cms.xf.newcms.domain.T100104.T100104RequestRecord;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhanrui
 * Date: 2010-10-21
 * Time: 11:28:16
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "T100103")
@ViewScoped
public class T100103Bean implements Serializable {

    private T100103ResponseRecord selectedRecord;
    private T100103ResponseRecord[] selectedRecords;

    private Log logger = LogFactory.getLog(this.getClass());
    private T100103ResponseRecord responseRecord = new T100103ResponseRecord();
    List<UIT100103ResponseRecord> responseFDList;
    List<T100103ResponseRecord> responseXFList;

    T100103CTL t100103ctl = new T100103CTL();

    private int totalcount;
    private BigDecimal totalamt;
    private BigDecimal totalPrincipalAmt;   //本金
    private BigDecimal totalInterestAmt;    //利息

    private String[] regionCodes = {"0532", "0531", "023", "0351"};
    private String[] regionNames = {"青岛", "济南", "重庆", "太原"};
    private SelectItem[] regionOptions;


    public T100103Bean() {
        initFilters();
    }

    private void initList() throws InvocationTargetException, IllegalAccessException {
        FacesContext context = FacesContext.getCurrentInstance();

        List<T100103ResponseRecord> fdList = null;
        try {
            fdList = t100103ctl.getAllFDRecords();
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "与新信贷的接口出现错误。", "请咨询系统管理人员。"));
            throw new RuntimeException("与新信贷的接口出现错误.");
        }
        totalcount = 0;
        initAmt();
        responseFDList = new ArrayList<UIT100103ResponseRecord>();

        for (T100103ResponseRecord record : fdList) {
            String tmpStr = record.getStddqh();
            String regioncdTmp, bankcdTmp, nameTmp;
            if (tmpStr == null || tmpStr.equals("null")) {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "地区代号转换有误。", ""));
                throw new RuntimeException("地区代号转换有误");
            } else {
                String[] code = tmpStr.split("-");
                record.setStddqh(code[0].trim());
                record.setStdyhh(code[1].trim());
            }
            UIT100103ResponseRecord ui = new UIT100103ResponseRecord();
            BeanUtils.copyProperties(ui,record);
            if ("2".equals(record.getStdsfsd())) {
                ui.setLocked("解锁");
            }else if ("1".equals(record.getStdsfsd())){
                ui.setLocked("锁定");
            }else{
                ui.setLocked("不确定");
            }
            responseFDList.add(ui);
            totalcount++;
            countAmt(record);

        }

    }

    private void initFilters() {
        regionOptions = createRegionOptions(regionNames, regionCodes);
    }

    private SelectItem[] createRegionOptions(String[] names, String[] codes) {
        SelectItem[] options = new SelectItem[codes.length + 1];

        options[0] = new SelectItem("", "全部地区");
        for (int i = 0; i < codes.length; i++) {
//            options[i + 1] = new SelectItem(codes[i],codes[i]);
            options[i + 1] = new SelectItem(codes[i], names[i]);
        }

        return options;
    }

    public String query() {

        try {
            initList();
        } catch (Exception e) {
            //TODO
            return null;
        }

        String hth, dqh, khmc;
        dqh = responseRecord.getStddqh();
        hth = responseRecord.getStdhth();
        khmc = responseRecord.getStdkhmc();
        totalcount = 0;
        initAmt();
        List<UIT100103ResponseRecord> newResponseFDList = new ArrayList<UIT100103ResponseRecord>();
        for (UIT100103ResponseRecord record : responseFDList) {
            if (StringUtils.isNotEmpty(hth)) {
                if (!record.getStdhth().equals(hth)) {
                    continue;
                }
            }
            if (StringUtils.isNotEmpty(khmc)) {
                if (!record.getStdkhmc().equals(khmc)) {
                    continue;
                }
            }
            if (StringUtils.isNotEmpty(dqh)) {
                if (!record.getStddqh().equals(dqh)) {
                    continue;
                }
            }
            newResponseFDList.add(record);
            totalcount++;
            countAmt(record);
        }
        responseFDList = newResponseFDList;
        return null;
    }

    private void initAmt() {
        totalamt = new BigDecimal(0);
        totalPrincipalAmt = new BigDecimal(0);
        totalInterestAmt = new BigDecimal(0);
    }

    private void countAmt(T100103ResponseRecord record) {
        totalamt = totalamt.add(new BigDecimal(record.getStdhkje()));
        totalPrincipalAmt = totalPrincipalAmt.add(new BigDecimal(record.getStdhkbj()));
        totalInterestAmt = totalInterestAmt.add(new BigDecimal(record.getStdhklx()));
    }

    public String onRowSelectNavigate(SelectEvent event) {
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("selectedRecord", event.getObject());

        return "FDCutpayDetail?faces-redirect=true";
    }


    //回写处理（利息锁定）
    public String doLockAll() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (this.responseFDList == null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息锁定时出现错误。", "请首先进行还款记录查询。"));

            return null;
        }
        if (selectedRecords.length > 0) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息锁定时出现错误。", "请勿选择明细记录。"));
            return null;
        }
        T100103ResponseRecord[] records = new T100103ResponseRecord[this.responseFDList.size()];
        startWriteBack(this.responseFDList.toArray(records),"3");
        //init();
        query();
        return null;
    }

    public String doLockMulti() {

        FacesContext context = FacesContext.getCurrentInstance();

        if (selectedRecords.length == 0) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息解锁时出现错误。", "未选择明细记录。"));
            return null;
        }

        startWriteBack(selectedRecords,"3");
        //init();
        query();

        return null;

    }

    public String doUnlockAll() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (this.responseFDList == null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息解锁时出现错误。", "请首先进行还款记录查询。"));

            return null;
        }
        if (selectedRecords.length > 0) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息解锁时出现错误。", "请勿选择明细记录。"));
            return null;
        }
        T100103ResponseRecord[] records = new T100103ResponseRecord[this.responseFDList.size()];
        startWriteBack(this.responseFDList.toArray(records),"2");
        //init();
        query();

        return null;
    }

    public String doUnlockMulti() {

        FacesContext context = FacesContext.getCurrentInstance();

        if (selectedRecords.length == 0) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息锁定时出现错误。", "未选择明细记录。"));
            return null;
        }

        startWriteBack(selectedRecords,"2");
        //init();
        query();
        
        return null;

    }

    private void startWriteBack(T100103ResponseRecord[] detls, String option) {
        FacesContext context = FacesContext.getCurrentInstance();

        try {
            int result = processWriteBack(detls, option);
            if (result != detls.length) {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "新信贷系统利息锁定结果。", "成功笔数：" + result + "  失败笔数：" + (detls.length - result)));
            } else {
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "新信贷系统利息锁定成功。", "  笔数：" + result));
            }
        } catch (Exception e) {
            logger.error("利息锁定时出现错误。", e);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "利息锁定时出现错误。", null));
        }
        //init();

    }

    /**
     *  20101020 单笔处理
     * @param detls
     * @param option   1-成功 2-失败(利息解锁)  3-利息锁定
     * @return
     * @throws Exception
     */

    public int processWriteBack(T100103ResponseRecord[] detls, String option) throws Exception {

        if ((!"1".equals(option))
                &&(!"2".equals(option))
                &&(!"3".equals(option))
                ) {
            throw new RuntimeException("参数错误！");
        }

        int count = 0;

        T100104CTL t100104ctl = new T100104CTL();

        for (T100103ResponseRecord detl : detls) {
/*
            if (!detl.getBillstatus().equals(XFBillStatus.BILLSTATUS_CORE_SUCCESS)) {
                logger.error("状态检查失败" + detl.getJournalno());
                continue;
            }
*/
            boolean txResult = false;
            T100104RequestRecord record = new T100104RequestRecord();
            record.setStdjjh(detl.getStdjjh());
            record.setStdqch(detl.getStdqch());
            record.setStdjhkkr(detl.getStdjhhkr());
            //1-成功 2-失败(利息解锁)  3-利息锁定
            record.setStdkkjg(option);
            T100104RequestList list = new T100104RequestList();
            list.add(record);
            //单笔发送处理
            txResult = t100104ctl.start(list);

            if (txResult) {
//                cutpaydetlPk.setJournalno(detl.getJournalno());
//                detl.setBillstatus(XFBillStatus.FD_WRITEBACK_SUCCESS);
//                detlDao.update(cutpaydetlPk, detl);
                count++;
            }
        }

        return count;
    }







    //==============================================================

//    public LazyDataModel<T100103ResponseRecord> getLazyModel() {
//        return lazyModel;
//    }

/*    public void setLazyModel(LazyDataModel<T100103ResponseRecord> lazyModel) {
        this.lazyModel = lazyModel;
    }*/

    public T100103ResponseRecord getSelectedRecord() {
        return selectedRecord;
    }

    public void setSelectedRecord(T100103ResponseRecord selectedRecord) {
        this.selectedRecord = selectedRecord;
    }

    public List<UIT100103ResponseRecord> getResponseFDList() {
        return responseFDList;
    }

    public void setResponseFDList(List<UIT100103ResponseRecord> responseFDList) {
        this.responseFDList = responseFDList;
    }

    public List<T100103ResponseRecord> getResponseXFList() {
        return responseXFList;
    }

    public void setResponseXFList(List<T100103ResponseRecord> responseXFList) {
        this.responseXFList = responseXFList;
    }

    public T100103ResponseRecord getResponseRecord() {
        return responseRecord;
    }

    public void setResponseRecord(T100103ResponseRecord responseRecord) {
        this.responseRecord = responseRecord;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public SelectItem[] getRegionOptions() {
        return regionOptions;
    }

    public BigDecimal getTotalPrincipalAmt() {
        return totalPrincipalAmt;
    }

    public BigDecimal getTotalInterestAmt() {
        return totalInterestAmt;
    }

    public String[] getRegionCodes() {
        return regionCodes;
    }

    public void setRegionCodes(String[] regionCodes) {
        this.regionCodes = regionCodes;
    }

    public String[] getRegionNames() {
        return regionNames;
    }

    public void setRegionNames(String[] regionNames) {
        this.regionNames = regionNames;
    }

    public T100103ResponseRecord[] getSelectedRecords() {
        return selectedRecords;
    }

    public void setSelectedRecords(T100103ResponseRecord[] selectedRecords) {
        this.selectedRecords = selectedRecords;
    }
}
