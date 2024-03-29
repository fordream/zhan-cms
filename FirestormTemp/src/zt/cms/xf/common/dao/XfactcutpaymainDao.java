/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package zt.cms.xf.common.dao;

import java.math.BigDecimal;
import java.util.Date;
import zt.cms.xf.common.dto.*;
import zt.cms.xf.common.exceptions.*;

public interface XfactcutpaymainDao
{
	/** 
	 * Inserts a new row in the XFACTCUTPAYMAIN table.
	 */
	public XfactcutpaymainPk insert(Xfactcutpaymain dto) throws XfactcutpaymainDaoException;

	/** 
	 * Updates a single row in the XFACTCUTPAYMAIN table.
	 */
	public void update(XfactcutpaymainPk pk, Xfactcutpaymain dto) throws XfactcutpaymainDaoException;

	/** 
	 * Deletes a single row in the XFACTCUTPAYMAIN table.
	 */
	public void delete(XfactcutpaymainPk pk) throws XfactcutpaymainDaoException;

	/** 
	 * Returns the rows from the XFACTCUTPAYMAIN table that matches the specified primary-key value.
	 */
	public Xfactcutpaymain findByPrimaryKey(XfactcutpaymainPk pk) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CONTRACTNO = :contractno AND POANO = :poano'.
	 */
	public Xfactcutpaymain findByPrimaryKey(String contractno, BigDecimal poano) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CPANO = :cpano'.
	 */
	public Xfactcutpaymain[] findWhereCpanoEquals(String cpano) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CPASTATUS = :cpastatus'.
	 */
	public Xfactcutpaymain[] findWhereCpastatusEquals(BigDecimal cpastatus) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CPAAMT = :cpaamt'.
	 */
	public Xfactcutpaymain[] findWhereCpaamtEquals(BigDecimal cpaamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'RECVCPAAMT = :recvcpaamt'.
	 */
	public Xfactcutpaymain[] findWhereRecvcpaamtEquals(BigDecimal recvcpaamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'GRACEPERIOD = :graceperiod'.
	 */
	public Xfactcutpaymain[] findWhereGraceperiodEquals(BigDecimal graceperiod) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLOSEDDATA = :closeddata'.
	 */
	public Xfactcutpaymain[] findWhereCloseddataEquals(Date closeddata) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'BALANCINGDATE = :balancingdate'.
	 */
	public Xfactcutpaymain[] findWhereBalancingdateEquals(Date balancingdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'RECVBRACHFEE = :recvbrachfee'.
	 */
	public Xfactcutpaymain[] findWhereRecvbrachfeeEquals(BigDecimal recvbrachfee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBAKBALANCE = :paybakbalance'.
	 */
	public Xfactcutpaymain[] findWherePaybakbalanceEquals(BigDecimal paybakbalance) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'BRACHFEEBALANCE = :brachfeebalance'.
	 */
	public Xfactcutpaymain[] findWhereBrachfeebalanceEquals(BigDecimal brachfeebalance) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAIDUPBRACHFEE = :paidupbrachfee'.
	 */
	public Xfactcutpaymain[] findWherePaidupbrachfeeEquals(BigDecimal paidupbrachfee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAIDUPAMT = :paidupamt'.
	 */
	public Xfactcutpaymain[] findWherePaidupamtEquals(BigDecimal paidupamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKBALANCE = :paybackbalance'.
	 */
	public Xfactcutpaymain[] findWherePaybackbalanceEquals(BigDecimal paybackbalance) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'LATEFEEBALANCE = :latefeebalance'.
	 */
	public Xfactcutpaymain[] findWhereLatefeebalanceEquals(BigDecimal latefeebalance) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'BREACHFEEBALANCE = :breachfeebalance'.
	 */
	public Xfactcutpaymain[] findWhereBreachfeebalanceEquals(BigDecimal breachfeebalance) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAIDUPBREACHFEE = :paidupbreachfee'.
	 */
	public Xfactcutpaymain[] findWherePaidupbreachfeeEquals(BigDecimal paidupbreachfee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAIDUPDATE = :paidupdate'.
	 */
	public Xfactcutpaymain[] findWherePaidupdateEquals(Date paidupdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'UNBILLEDBREACHFEE = :unbilledbreachfee'.
	 */
	public Xfactcutpaymain[] findWhereUnbilledbreachfeeEquals(BigDecimal unbilledbreachfee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'UNBILLEDLATEFEE = :unbilledlatefee'.
	 */
	public Xfactcutpaymain[] findWhereUnbilledlatefeeEquals(BigDecimal unbilledlatefee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria ''.
	 */
	public Xfactcutpaymain[] findAll() throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CONTRACTNO = :contractno'.
	 */
	public Xfactcutpaymain[] findWhereContractnoEquals(String contractno) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'POANO = :poano'.
	 */
	public Xfactcutpaymain[] findWherePoanoEquals(BigDecimal poano) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PBSTATUS = :pbstatus'.
	 */
	public Xfactcutpaymain[] findWherePbstatusEquals(String pbstatus) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKAMT = :paybackamt'.
	 */
	public Xfactcutpaymain[] findWherePaybackamtEquals(BigDecimal paybackamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKDATE = :paybackdate'.
	 */
	public Xfactcutpaymain[] findWherePaybackdateEquals(Date paybackdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'STARTDATE = :startdate'.
	 */
	public Xfactcutpaymain[] findWhereStartdateEquals(Date startdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLOSEDDATE = :closeddate'.
	 */
	public Xfactcutpaymain[] findWhereCloseddateEquals(Date closeddate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'OVERDUECD = :overduecd'.
	 */
	public Xfactcutpaymain[] findWhereOverduecdEquals(String overduecd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CHARGEOFFCD = :chargeoffcd'.
	 */
	public Xfactcutpaymain[] findWhereChargeoffcdEquals(String chargeoffcd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLOSEDCD = :closedcd'.
	 */
	public Xfactcutpaymain[] findWhereClosedcdEquals(String closedcd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PRINCIPALAMT = :principalamt'.
	 */
	public Xfactcutpaymain[] findWherePrincipalamtEquals(BigDecimal principalamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'SERVICECHARGEFEE = :servicechargefee'.
	 */
	public Xfactcutpaymain[] findWhereServicechargefeeEquals(BigDecimal servicechargefee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_PAYBACKAMT = :odbPaybackamt'.
	 */
	public Xfactcutpaymain[] findWhereOdbPaybackamtEquals(BigDecimal odbPaybackamt) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_PAYBACKDATE = :odbPaybackdate'.
	 */
	public Xfactcutpaymain[] findWhereOdbPaybackdateEquals(Date odbPaybackdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_BREACHFEE = :odbBreachfee'.
	 */
	public Xfactcutpaymain[] findWhereOdbBreachfeeEquals(BigDecimal odbBreachfee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_LATEFEE = :odbLatefee'.
	 */
	public Xfactcutpaymain[] findWhereOdbLatefeeEquals(BigDecimal odbLatefee) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_CHARGEOFFCD = :odbChargeoffcd'.
	 */
	public Xfactcutpaymain[] findWhereOdbChargeoffcdEquals(String odbChargeoffcd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_CLOSEDCD = :odbClosedcd'.
	 */
	public Xfactcutpaymain[] findWhereOdbClosedcdEquals(String odbClosedcd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_STARTDATE = :odbStartdate'.
	 */
	public Xfactcutpaymain[] findWhereOdbStartdateEquals(Date odbStartdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'ODB_CLOSEDDATE = :odbCloseddate'.
	 */
	public Xfactcutpaymain[] findWhereOdbCloseddateEquals(Date odbCloseddate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLIENTNAME = :clientname'.
	 */
	public Xfactcutpaymain[] findWhereClientnameEquals(String clientname) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLIENTACT = :clientact'.
	 */
	public Xfactcutpaymain[] findWhereClientactEquals(String clientact) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKACT = :paybackact'.
	 */
	public Xfactcutpaymain[] findWherePaybackactEquals(String paybackact) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKACTNAME = :paybackactname'.
	 */
	public Xfactcutpaymain[] findWherePaybackactnameEquals(String paybackactname) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKBANKID = :paybackbankid'.
	 */
	public Xfactcutpaymain[] findWherePaybackbankidEquals(String paybackbankid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKBANKNO = :paybackbankno'.
	 */
	public Xfactcutpaymain[] findWherePaybackbanknoEquals(String paybackbankno) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PAYBACKBANKNAME = :paybackbankname'.
	 */
	public Xfactcutpaymain[] findWherePaybackbanknameEquals(String paybackbankname) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'RECVACT = :recvact'.
	 */
	public Xfactcutpaymain[] findWhereRecvactEquals(String recvact) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'RECVBANKID = :recvbankid'.
	 */
	public Xfactcutpaymain[] findWhereRecvbankidEquals(String recvbankid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'RECVBANKNO = :recvbankno'.
	 */
	public Xfactcutpaymain[] findWhereRecvbanknoEquals(String recvbankno) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'OPERATORID = :operatorid'.
	 */
	public Xfactcutpaymain[] findWhereOperatoridEquals(String operatorid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'OPERATEDATE = :operatedate'.
	 */
	public Xfactcutpaymain[] findWhereOperatedateEquals(Date operatedate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CHECKERID = :checkerid'.
	 */
	public Xfactcutpaymain[] findWhereCheckeridEquals(String checkerid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CHECKDATE = :checkdate'.
	 */
	public Xfactcutpaymain[] findWhereCheckdateEquals(Date checkdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CREATORID = :creatorid'.
	 */
	public Xfactcutpaymain[] findWhereCreatoridEquals(String creatorid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CREATEDATE = :createdate'.
	 */
	public Xfactcutpaymain[] findWhereCreatedateEquals(Date createdate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CREATEFORM = :createform'.
	 */
	public Xfactcutpaymain[] findWhereCreateformEquals(String createform) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'UPDATORID = :updatorid'.
	 */
	public Xfactcutpaymain[] findWhereUpdatoridEquals(String updatorid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'UPDATEDATE = :updatedate'.
	 */
	public Xfactcutpaymain[] findWhereUpdatedateEquals(Date updatedate) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'UPDATEFORM = :updateform'.
	 */
	public Xfactcutpaymain[] findWhereUpdateformEquals(String updateform) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CUSTOMER_CODE = :customerCode'.
	 */
	public Xfactcutpaymain[] findWhereCustomerCodeEquals(String customerCode) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'SIGN_ACCOUNT_NO = :signAccountNo'.
	 */
	public Xfactcutpaymain[] findWhereSignAccountNoEquals(String signAccountNo) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLIENTNO = :clientno'.
	 */
	public Xfactcutpaymain[] findWhereClientnoEquals(String clientno) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLIENTIDTYPE = :clientidtype'.
	 */
	public Xfactcutpaymain[] findWhereClientidtypeEquals(String clientidtype) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'CLIENTID = :clientid'.
	 */
	public Xfactcutpaymain[] findWhereClientidEquals(String clientid) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PRECUTPAYCD = :precutpaycd'.
	 */
	public Xfactcutpaymain[] findWherePrecutpaycdEquals(String precutpaycd) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the criteria 'PRECUTPAYDATE = :precutpaydate'.
	 */
	public Xfactcutpaymain[] findWherePrecutpaydateEquals(Date precutpaydate) throws XfactcutpaymainDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the specified arbitrary SQL statement
	 */
	public Xfactcutpaymain[] findByDynamicSelect(String sql, Object[] sqlParams) throws XfactcutpaymainDaoException;

	/** 
	 * Returns all rows from the XFACTCUTPAYMAIN table that match the specified arbitrary SQL statement
	 */
	public Xfactcutpaymain[] findByDynamicWhere(String sql, Object[] sqlParams) throws XfactcutpaymainDaoException;

}
