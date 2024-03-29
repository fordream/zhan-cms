//Source file: e:\\java\\zt\\platform\\form\\config\\TableBeanManager.java

package zt.platform.form.config;

import zt.platform.db.ConnectionManager;
import zt.platform.db.DBUtil;
import zt.platform.db.DatabaseConnection;
import zt.platform.db.RecordSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 管理表的Meta信息
 * 平台将所有表的MetaData信息定义在数据库中，在系统启动时将所有的信息加载到内存中，以加快系统的运行速度。
 * 在static语句块中初始化，即加载表中字段enabled=1的所有记录的信息，
 * 信息 来源（systblinfomain、systblinfodetl）
 *
 * @author 请替换
 * @version 1.0
 * @created 2003年10月11日
 */
public class TableBeanManager {

    /**
     * 管理器，用来管理所有的表定义信息 存放方式:tablename-TableBean Instance值对
     *
     * @author sun
     * @since 2003年10月11日
     */
    private static Map tableBeans;
    /**
     * Description of the Field
     *
     * @author sun
     * @since 2003年10月11日
     */
    public static Logger logger = Logger.getLogger("zt.platform.form.config.TableBeanManager");

    static {
        System.out.println("TableBeanManager initing ...");
        init();
        System.out.println("TableBeanManager inited ok !");
    }

    /**
     * 按照表名获取表信息定义实例
     *
     * @param name
     * @return zt.platform.form.config.TableBean
     * @roseuid 3F7161650260
     */
    public static TableBean getTable(String name) {
        return (TableBean) tableBeans.get(name);
    }

    public static void init() {

        ConnectionManager manager = ConnectionManager.getInstance();
        DatabaseConnection con = manager.getConnection();
        RecordSet rs = con.executeQuery("Select * from PTTBLINFOMAIN where enabled='1'");
        tableBeans = new HashMap();
        while (rs.next()) {
            String tableName = rs.getString("tablename").trim();
            //Find Table
            TableBean tb = new TableBean(tableName);
            int type = Integer.parseInt(rs.getString("type").trim());
            tb.setType(type);
            if (type == 1) {
                tb.setDynamicTbl(rs.getString("dynamictbl"));
            } else {
                tb.setDynamicTbl("");
            }
            tb.setDescription(rs.getString("description") == null ? "" :
                    DBUtil.fromDB(rs.getString("description").trim()));
            tableBeans.put(tb.getName(), tb);
        }

        //for each tablebeans ,get the value!
        Iterator itb = tableBeans.values().iterator();
        String tempStr = "select * from PTTBLINFODETL where tablename=";
        //PreparedStatement pst=con.getPreparedStatement(tempStr);
        while (itb.hasNext()) {
            TableBean tb = (TableBean) itb.next();
            String tableName = tb.getName();
            //pst.setString(1, tableName);
            RecordSet fieldRs = con.executeQuery(tempStr + "'" + tb.getName() + "'");
            while (fieldRs.next()) {
                FieldBean field = new FieldBean();
                field.setSeqno(fieldRs.getInt("seqno"));
                field.setName(fieldRs.getString("name").trim());
                field.setIsPrimary(fieldRs.getBoolean("isprimarykey"));
                field.setDatatype(fieldRs.getInt("datatype"));
                field.setIsSearch(fieldRs.getBoolean("searchkey"));
                field.setLength(fieldRs.getInt("length"));
                field.setIsnull(fieldRs.getBoolean("isnull"));
                field.setIsrepeat(fieldRs.getBoolean("isrepeat"));
                //caption have not??
                field.setCaption((fieldRs.getString("caption") == null) ? "" :
                        DBUtil.fromDB(fieldRs.getString("caption").trim()));
                field.setDescription(DBUtil.fromDB((fieldRs.getString("description") == null) ?
                        "" : fieldRs.getString("description")));
                field.setDefaultValue(fieldRs.getString("defaultvalue") == null ? "" :
                        DBUtil.fromDB(fieldRs.getString("defaultvalue").
                                trim()));
                field.setPrecision(fieldRs.getInt("precision"));
                field.setDecimals(fieldRs.getInt("decimaldigits"));

                field.setReftbl(fieldRs.getString("reftbl"));
                field.setRefnamefld(fieldRs.getString("refname"));
                field.setRefvaluefld(fieldRs.getString("refvalue"));
                field.setRefWhere(fieldRs.getString("refwhere"));
                field.setEnutpname(fieldRs.getString("enuid"));
                field.setNeedEncode(fieldRs.getBoolean("needencode"));
                tb.addField(field);
            }
        }
        con.commit();
        manager.releaseConnection(con);
    }
}
