/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package zt.cms.xf.common.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import zt.cms.xf.common.dao.FdcutpaydetlDao;
import zt.cms.xf.common.dto.Fdcutpaydetl;
import zt.cms.xf.common.exceptions.FdcutpaydetlDaoException;
import zt.cms.xf.common.factory.FdcutpaydetlDaoFactory;

public class FdcutpaydetlDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereSeqnoEquals("");
		// findWhereXdkhzdKhbhEquals("");
		// findWhereXdkhzdKhmcEquals("");
		// findWhereGthtjhHtbhEquals("");
		// findWhereGthtjhDateEquals("");
		// findWhereGthtjhLlEquals(null);
		// findWhereGthtjhJhjeEquals(null);
		// findWhereGthtjhBjjeEquals(null);
		// findWhereGthtjhLxjeEquals(null);
		// findWhereGthtbZhbhEquals("");
		// findWhereCutpayactnoEquals("");
		// findWhereBillstatusEquals("");
		// findWhereCreatetimeEquals(null);
		// findWhereFailreasonEquals("");
		// findWhereRemarkEquals("");
		// findWherePreflagEquals("");
		// findWhereGthtjhHtnmEquals("");
		// findWhereGthtjhJhxhEquals("");
		// findWhereJournalnoEquals("");
		// findWhereRegioncdEquals("");
		// findWhereBankcdEquals("");
		// findWhereLockstatusEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSeqnoEquals'
	 * 
	 * @param seqno
	 */
	public static void findWhereSeqnoEquals(String seqno)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereSeqnoEquals(seqno);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereXdkhzdKhbhEquals'
	 * 
	 * @param xdkhzdKhbh
	 */
	public static void findWhereXdkhzdKhbhEquals(String xdkhzdKhbh)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereXdkhzdKhbhEquals(xdkhzdKhbh);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereXdkhzdKhmcEquals'
	 * 
	 * @param xdkhzdKhmc
	 */
	public static void findWhereXdkhzdKhmcEquals(String xdkhzdKhmc)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereXdkhzdKhmcEquals(xdkhzdKhmc);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhHtbhEquals'
	 * 
	 * @param gthtjhHtbh
	 */
	public static void findWhereGthtjhHtbhEquals(String gthtjhHtbh)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhHtbhEquals(gthtjhHtbh);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhDateEquals'
	 * 
	 * @param gthtjhDate
	 */
	public static void findWhereGthtjhDateEquals(String gthtjhDate)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhDateEquals(gthtjhDate);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhLlEquals'
	 * 
	 * @param gthtjhLl
	 */
	public static void findWhereGthtjhLlEquals(BigDecimal gthtjhLl)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhLlEquals(gthtjhLl);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhJhjeEquals'
	 * 
	 * @param gthtjhJhje
	 */
	public static void findWhereGthtjhJhjeEquals(BigDecimal gthtjhJhje)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhJhjeEquals(gthtjhJhje);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhBjjeEquals'
	 * 
	 * @param gthtjhBjje
	 */
	public static void findWhereGthtjhBjjeEquals(BigDecimal gthtjhBjje)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhBjjeEquals(gthtjhBjje);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhLxjeEquals'
	 * 
	 * @param gthtjhLxje
	 */
	public static void findWhereGthtjhLxjeEquals(BigDecimal gthtjhLxje)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhLxjeEquals(gthtjhLxje);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtbZhbhEquals'
	 * 
	 * @param gthtbZhbh
	 */
	public static void findWhereGthtbZhbhEquals(String gthtbZhbh)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtbZhbhEquals(gthtbZhbh);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCutpayactnoEquals'
	 * 
	 * @param cutpayactno
	 */
	public static void findWhereCutpayactnoEquals(String cutpayactno)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereCutpayactnoEquals(cutpayactno);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereBillstatusEquals'
	 * 
	 * @param billstatus
	 */
	public static void findWhereBillstatusEquals(String billstatus)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereBillstatusEquals(billstatus);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereCreatetimeEquals'
	 * 
	 * @param createtime
	 */
	public static void findWhereCreatetimeEquals(Date createtime)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereCreatetimeEquals(createtime);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFailreasonEquals'
	 * 
	 * @param failreason
	 */
	public static void findWhereFailreasonEquals(String failreason)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereFailreasonEquals(failreason);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRemarkEquals'
	 * 
	 * @param remark
	 */
	public static void findWhereRemarkEquals(String remark)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereRemarkEquals(remark);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWherePreflagEquals'
	 * 
	 * @param preflag
	 */
	public static void findWherePreflagEquals(String preflag)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWherePreflagEquals(preflag);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhHtnmEquals'
	 * 
	 * @param gthtjhHtnm
	 */
	public static void findWhereGthtjhHtnmEquals(String gthtjhHtnm)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhHtnmEquals(gthtjhHtnm);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGthtjhJhxhEquals'
	 * 
	 * @param gthtjhJhxh
	 */
	public static void findWhereGthtjhJhxhEquals(String gthtjhJhxh)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereGthtjhJhxhEquals(gthtjhJhxh);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereJournalnoEquals'
	 * 
	 * @param journalno
	 */
	public static void findWhereJournalnoEquals(String journalno)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereJournalnoEquals(journalno);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereRegioncdEquals'
	 * 
	 * @param regioncd
	 */
	public static void findWhereRegioncdEquals(String regioncd)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereRegioncdEquals(regioncd);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereBankcdEquals'
	 * 
	 * @param bankcd
	 */
	public static void findWhereBankcdEquals(String bankcd)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereBankcdEquals(bankcd);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLockstatusEquals'
	 * 
	 * @param lockstatus
	 */
	public static void findWhereLockstatusEquals(String lockstatus)
	{
		try {
			FdcutpaydetlDao _dao = getFdcutpaydetlDao();
			Fdcutpaydetl _result[] = _dao.findWhereLockstatusEquals(lockstatus);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getFdcutpaydetlDao'
	 * 
	 * @return FdcutpaydetlDao
	 */
	public static FdcutpaydetlDao getFdcutpaydetlDao()
	{
		return FdcutpaydetlDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Fdcutpaydetl dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getSeqno() );
		buf.append( ", " );
		buf.append( dto.getXdkhzdKhbh() );
		buf.append( ", " );
		buf.append( dto.getXdkhzdKhmc() );
		buf.append( ", " );
		buf.append( dto.getGthtjhHtbh() );
		buf.append( ", " );
		buf.append( dto.getGthtjhDate() );
		buf.append( ", " );
		buf.append( dto.getGthtjhLl() );
		buf.append( ", " );
		buf.append( dto.getGthtjhJhje() );
		buf.append( ", " );
		buf.append( dto.getGthtjhBjje() );
		buf.append( ", " );
		buf.append( dto.getGthtjhLxje() );
		buf.append( ", " );
		buf.append( dto.getGthtbZhbh() );
		buf.append( ", " );
		buf.append( dto.getBillstatus() );
		buf.append( ", " );
		buf.append( dto.getCreatetime() );
		buf.append( ", " );
		buf.append( dto.getCutpayactno() );
		buf.append( ", " );
		buf.append( dto.getFailreason() );
		buf.append( ", " );
		buf.append( dto.getRemark() );
		buf.append( ", " );
		buf.append( dto.getPreflag() );
		buf.append( ", " );
		buf.append( dto.getGthtjhHtnm() );
		buf.append( ", " );
		buf.append( dto.getGthtjhJhxh() );
		buf.append( ", " );
		buf.append( dto.getJournalno() );
		buf.append( ", " );
		buf.append( dto.getRegioncd() );
		buf.append( ", " );
		buf.append( dto.getBankcd() );
		buf.append( ", " );
		buf.append( dto.getLockstatus() );
		System.out.println( buf.toString() );
	}

}
