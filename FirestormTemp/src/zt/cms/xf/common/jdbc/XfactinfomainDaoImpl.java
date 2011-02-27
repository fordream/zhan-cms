/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package zt.cms.xf.common.jdbc;

import zt.cms.xf.common.dao.*;
import zt.cms.xf.common.factory.*;
import java.util.Date;
import java.math.BigDecimal;
import zt.cms.xf.common.dto.*;
import zt.cms.xf.common.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import org.apache.log4j.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class XfactinfomainDaoImpl extends AbstractDAO implements XfactinfomainDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	protected static final Logger logger = Logger.getLogger( XfactinfomainDaoImpl.class );

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT CONTRACTNO, POANO, STARTDATE, ENDDATE, DURATION, CURNO, CONTRACTAMT, PRINCIPALAMT, FSERVICECHARGE, POASTATUS, PAYBAKAMT, LATEFEEAMT, BREACHFEEAMT, MANAGERFEEAMT, OVERDUETIMES, CLIENTACT, PAYBACKACT, PAYBACKBANKID, PAYBACKBANKNO, RECVACT, RECVBANKID, RECVBANKNO, RECVBANKNAME, OPERATORID, OPERATEDATE, CHECKERID, CHECKDATE, CREATORID, CREATEDATE, CREATEFORM, UPDATORID, UPDATEDATE, UPDATEFORM FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( CONTRACTNO, POANO, STARTDATE, ENDDATE, DURATION, CURNO, CONTRACTAMT, PRINCIPALAMT, FSERVICECHARGE, POASTATUS, PAYBAKAMT, LATEFEEAMT, BREACHFEEAMT, MANAGERFEEAMT, OVERDUETIMES, CLIENTACT, PAYBACKACT, PAYBACKBANKID, PAYBACKBANKNO, RECVACT, RECVBANKID, RECVBANKNO, RECVBANKNAME, OPERATORID, OPERATEDATE, CHECKERID, CHECKDATE, CREATORID, CREATEDATE, CREATEFORM, UPDATORID, UPDATEDATE, UPDATEFORM ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET CONTRACTNO = ?, POANO = ?, STARTDATE = ?, ENDDATE = ?, DURATION = ?, CURNO = ?, CONTRACTAMT = ?, PRINCIPALAMT = ?, FSERVICECHARGE = ?, POASTATUS = ?, PAYBAKAMT = ?, LATEFEEAMT = ?, BREACHFEEAMT = ?, MANAGERFEEAMT = ?, OVERDUETIMES = ?, CLIENTACT = ?, PAYBACKACT = ?, PAYBACKBANKID = ?, PAYBACKBANKNO = ?, RECVACT = ?, RECVBANKID = ?, RECVBANKNO = ?, RECVBANKNAME = ?, OPERATORID = ?, OPERATEDATE = ?, CHECKERID = ?, CHECKDATE = ?, CREATORID = ?, CREATEDATE = ?, CREATEFORM = ?, UPDATORID = ?, UPDATEDATE = ?, UPDATEFORM = ? WHERE CONTRACTNO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE CONTRACTNO = ?";

	/** 
	 * Index of column CONTRACTNO
	 */
	protected static final int COLUMN_CONTRACTNO = 1;

	/** 
	 * Index of column POANO
	 */
	protected static final int COLUMN_POANO = 2;

	/** 
	 * Index of column STARTDATE
	 */
	protected static final int COLUMN_STARTDATE = 3;

	/** 
	 * Index of column ENDDATE
	 */
	protected static final int COLUMN_ENDDATE = 4;

	/** 
	 * Index of column DURATION
	 */
	protected static final int COLUMN_DURATION = 5;

	/** 
	 * Index of column CURNO
	 */
	protected static final int COLUMN_CURNO = 6;

	/** 
	 * Index of column CONTRACTAMT
	 */
	protected static final int COLUMN_CONTRACTAMT = 7;

	/** 
	 * Index of column PRINCIPALAMT
	 */
	protected static final int COLUMN_PRINCIPALAMT = 8;

	/** 
	 * Index of column FSERVICECHARGE
	 */
	protected static final int COLUMN_FSERVICECHARGE = 9;

	/** 
	 * Index of column POASTATUS
	 */
	protected static final int COLUMN_POASTATUS = 10;

	/** 
	 * Index of column PAYBAKAMT
	 */
	protected static final int COLUMN_PAYBAKAMT = 11;

	/** 
	 * Index of column LATEFEEAMT
	 */
	protected static final int COLUMN_LATEFEEAMT = 12;

	/** 
	 * Index of column BREACHFEEAMT
	 */
	protected static final int COLUMN_BREACHFEEAMT = 13;

	/** 
	 * Index of column MANAGERFEEAMT
	 */
	protected static final int COLUMN_MANAGERFEEAMT = 14;

	/** 
	 * Index of column OVERDUETIMES
	 */
	protected static final int COLUMN_OVERDUETIMES = 15;

	/** 
	 * Index of column CLIENTACT
	 */
	protected static final int COLUMN_CLIENTACT = 16;

	/** 
	 * Index of column PAYBACKACT
	 */
	protected static final int COLUMN_PAYBACKACT = 17;

	/** 
	 * Index of column PAYBACKBANKID
	 */
	protected static final int COLUMN_PAYBACKBANKID = 18;

	/** 
	 * Index of column PAYBACKBANKNO
	 */
	protected static final int COLUMN_PAYBACKBANKNO = 19;

	/** 
	 * Index of column RECVACT
	 */
	protected static final int COLUMN_RECVACT = 20;

	/** 
	 * Index of column RECVBANKID
	 */
	protected static final int COLUMN_RECVBANKID = 21;

	/** 
	 * Index of column RECVBANKNO
	 */
	protected static final int COLUMN_RECVBANKNO = 22;

	/** 
	 * Index of column RECVBANKNAME
	 */
	protected static final int COLUMN_RECVBANKNAME = 23;

	/** 
	 * Index of column OPERATORID
	 */
	protected static final int COLUMN_OPERATORID = 24;

	/** 
	 * Index of column OPERATEDATE
	 */
	protected static final int COLUMN_OPERATEDATE = 25;

	/** 
	 * Index of column CHECKERID
	 */
	protected static final int COLUMN_CHECKERID = 26;

	/** 
	 * Index of column CHECKDATE
	 */
	protected static final int COLUMN_CHECKDATE = 27;

	/** 
	 * Index of column CREATORID
	 */
	protected static final int COLUMN_CREATORID = 28;

	/** 
	 * Index of column CREATEDATE
	 */
	protected static final int COLUMN_CREATEDATE = 29;

	/** 
	 * Index of column CREATEFORM
	 */
	protected static final int COLUMN_CREATEFORM = 30;

	/** 
	 * Index of column UPDATORID
	 */
	protected static final int COLUMN_UPDATORID = 31;

	/** 
	 * Index of column UPDATEDATE
	 */
	protected static final int COLUMN_UPDATEDATE = 32;

	/** 
	 * Index of column UPDATEFORM
	 */
	protected static final int COLUMN_UPDATEFORM = 33;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 33;

	/** 
	 * Index of primary-key column CONTRACTNO
	 */
	protected static final int PK_COLUMN_CONTRACTNO = 1;

	/** 
	 * Inserts a new row in the XFACTINFOMAIN table.
	 */
	public XfactinfomainPk insert(Xfactinfomain dto) throws XfactinfomainDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getContractno() );
			stmt.setString( index++, dto.getPoano() );
			stmt.setTimestamp(index++, dto.getStartdate()==null ? null : new java.sql.Timestamp( dto.getStartdate().getTime() ) );
			stmt.setTimestamp(index++, dto.getEnddate()==null ? null : new java.sql.Timestamp( dto.getEnddate().getTime() ) );
			stmt.setBigDecimal( index++, dto.getDuration() );
			stmt.setString( index++, dto.getCurno() );
			stmt.setBigDecimal( index++, dto.getContractamt() );
			stmt.setBigDecimal( index++, dto.getPrincipalamt() );
			stmt.setBigDecimal( index++, dto.getFservicecharge() );
			stmt.setBigDecimal( index++, dto.getPoastatus() );
			stmt.setBigDecimal( index++, dto.getPaybakamt() );
			stmt.setBigDecimal( index++, dto.getLatefeeamt() );
			stmt.setBigDecimal( index++, dto.getBreachfeeamt() );
			stmt.setBigDecimal( index++, dto.getManagerfeeamt() );
			stmt.setBigDecimal( index++, dto.getOverduetimes() );
			stmt.setString( index++, dto.getClientact() );
			stmt.setString( index++, dto.getPaybackact() );
			stmt.setString( index++, dto.getPaybackbankid() );
			stmt.setString( index++, dto.getPaybackbankno() );
			stmt.setString( index++, dto.getRecvact() );
			stmt.setString( index++, dto.getRecvbankid() );
			stmt.setString( index++, dto.getRecvbankno() );
			stmt.setString( index++, dto.getRecvbankname() );
			stmt.setString( index++, dto.getOperatorid() );
			stmt.setTimestamp(index++, dto.getOperatedate()==null ? null : new java.sql.Timestamp( dto.getOperatedate().getTime() ) );
			stmt.setString( index++, dto.getCheckerid() );
			stmt.setTimestamp(index++, dto.getCheckdate()==null ? null : new java.sql.Timestamp( dto.getCheckdate().getTime() ) );
			stmt.setString( index++, dto.getCreatorid() );
			stmt.setTimestamp(index++, dto.getCreatedate()==null ? null : new java.sql.Timestamp( dto.getCreatedate().getTime() ) );
			stmt.setString( index++, dto.getCreateform() );
			stmt.setString( index++, dto.getUpdatorid() );
			stmt.setTimestamp(index++, dto.getUpdatedate()==null ? null : new java.sql.Timestamp( dto.getUpdatedate().getTime() ) );
			stmt.setString( index++, dto.getUpdateform() );
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_INSERT + " with DTO: " + dto);
			}
		
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new XfactinfomainDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the XFACTINFOMAIN table.
	 */
	public void update(XfactinfomainPk pk, Xfactinfomain dto) throws XfactinfomainDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_UPDATE + " with DTO: " + dto);
			}
		
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setString( index++, dto.getContractno() );
			stmt.setString( index++, dto.getPoano() );
			stmt.setTimestamp(index++, dto.getStartdate()==null ? null : new java.sql.Timestamp( dto.getStartdate().getTime() ) );
			stmt.setTimestamp(index++, dto.getEnddate()==null ? null : new java.sql.Timestamp( dto.getEnddate().getTime() ) );
			stmt.setBigDecimal( index++, dto.getDuration() );
			stmt.setString( index++, dto.getCurno() );
			stmt.setBigDecimal( index++, dto.getContractamt() );
			stmt.setBigDecimal( index++, dto.getPrincipalamt() );
			stmt.setBigDecimal( index++, dto.getFservicecharge() );
			stmt.setBigDecimal( index++, dto.getPoastatus() );
			stmt.setBigDecimal( index++, dto.getPaybakamt() );
			stmt.setBigDecimal( index++, dto.getLatefeeamt() );
			stmt.setBigDecimal( index++, dto.getBreachfeeamt() );
			stmt.setBigDecimal( index++, dto.getManagerfeeamt() );
			stmt.setBigDecimal( index++, dto.getOverduetimes() );
			stmt.setString( index++, dto.getClientact() );
			stmt.setString( index++, dto.getPaybackact() );
			stmt.setString( index++, dto.getPaybackbankid() );
			stmt.setString( index++, dto.getPaybackbankno() );
			stmt.setString( index++, dto.getRecvact() );
			stmt.setString( index++, dto.getRecvbankid() );
			stmt.setString( index++, dto.getRecvbankno() );
			stmt.setString( index++, dto.getRecvbankname() );
			stmt.setString( index++, dto.getOperatorid() );
			stmt.setTimestamp(index++, dto.getOperatedate()==null ? null : new java.sql.Timestamp( dto.getOperatedate().getTime() ) );
			stmt.setString( index++, dto.getCheckerid() );
			stmt.setTimestamp(index++, dto.getCheckdate()==null ? null : new java.sql.Timestamp( dto.getCheckdate().getTime() ) );
			stmt.setString( index++, dto.getCreatorid() );
			stmt.setTimestamp(index++, dto.getCreatedate()==null ? null : new java.sql.Timestamp( dto.getCreatedate().getTime() ) );
			stmt.setString( index++, dto.getCreateform() );
			stmt.setString( index++, dto.getUpdatorid() );
			stmt.setTimestamp(index++, dto.getUpdatedate()==null ? null : new java.sql.Timestamp( dto.getUpdatedate().getTime() ) );
			stmt.setString( index++, dto.getUpdateform() );
			stmt.setString( 34, pk.getContractno() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new XfactinfomainDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the XFACTINFOMAIN table.
	 */
	public void delete(XfactinfomainPk pk) throws XfactinfomainDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL_DELETE + " with PK: " + pk);
			}
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getContractno() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			if (logger.isDebugEnabled()) {
				logger.debug( rows + " rows affected (" + (t2-t1) + " ms)");
			}
		
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new XfactinfomainDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the XFACTINFOMAIN table that matches the specified primary-key value.
	 */
	public Xfactinfomain findByPrimaryKey(XfactinfomainPk pk) throws XfactinfomainDaoException
	{
		return findByPrimaryKey( pk.getContractno() );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CONTRACTNO = :contractno'.
	 */
	public Xfactinfomain findByPrimaryKey(String contractno) throws XfactinfomainDaoException
	{
		Xfactinfomain ret[] = findByDynamicSelect( SQL_SELECT + " WHERE CONTRACTNO = ?", new Object[] { contractno } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria ''.
	 */
	public Xfactinfomain[] findAll() throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY CONTRACTNO", null );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CONTRACTNO = :contractno'.
	 */
	public Xfactinfomain[] findWhereContractnoEquals(String contractno) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTRACTNO = ? ORDER BY CONTRACTNO", new Object[] { contractno } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'POANO = :poano'.
	 */
	public Xfactinfomain[] findWherePoanoEquals(String poano) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE POANO = ? ORDER BY POANO", new Object[] { poano } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'STARTDATE = :startdate'.
	 */
	public Xfactinfomain[] findWhereStartdateEquals(Date startdate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE STARTDATE = ? ORDER BY STARTDATE", new Object[] { startdate==null ? null : new java.sql.Timestamp( startdate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'ENDDATE = :enddate'.
	 */
	public Xfactinfomain[] findWhereEnddateEquals(Date enddate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ENDDATE = ? ORDER BY ENDDATE", new Object[] { enddate==null ? null : new java.sql.Timestamp( enddate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'DURATION = :duration'.
	 */
	public Xfactinfomain[] findWhereDurationEquals(BigDecimal duration) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DURATION = ? ORDER BY DURATION", new Object[] { duration } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CURNO = :curno'.
	 */
	public Xfactinfomain[] findWhereCurnoEquals(String curno) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CURNO = ? ORDER BY CURNO", new Object[] { curno } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CONTRACTAMT = :contractamt'.
	 */
	public Xfactinfomain[] findWhereContractamtEquals(BigDecimal contractamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CONTRACTAMT = ? ORDER BY CONTRACTAMT", new Object[] { contractamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'PRINCIPALAMT = :principalamt'.
	 */
	public Xfactinfomain[] findWherePrincipalamtEquals(BigDecimal principalamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRINCIPALAMT = ? ORDER BY PRINCIPALAMT", new Object[] { principalamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'FSERVICECHARGE = :fservicecharge'.
	 */
	public Xfactinfomain[] findWhereFservicechargeEquals(BigDecimal fservicecharge) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FSERVICECHARGE = ? ORDER BY FSERVICECHARGE", new Object[] { fservicecharge } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'POASTATUS = :poastatus'.
	 */
	public Xfactinfomain[] findWherePoastatusEquals(BigDecimal poastatus) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE POASTATUS = ? ORDER BY POASTATUS", new Object[] { poastatus } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'PAYBAKAMT = :paybakamt'.
	 */
	public Xfactinfomain[] findWherePaybakamtEquals(BigDecimal paybakamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAYBAKAMT = ? ORDER BY PAYBAKAMT", new Object[] { paybakamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'LATEFEEAMT = :latefeeamt'.
	 */
	public Xfactinfomain[] findWhereLatefeeamtEquals(BigDecimal latefeeamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LATEFEEAMT = ? ORDER BY LATEFEEAMT", new Object[] { latefeeamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'BREACHFEEAMT = :breachfeeamt'.
	 */
	public Xfactinfomain[] findWhereBreachfeeamtEquals(BigDecimal breachfeeamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BREACHFEEAMT = ? ORDER BY BREACHFEEAMT", new Object[] { breachfeeamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'MANAGERFEEAMT = :managerfeeamt'.
	 */
	public Xfactinfomain[] findWhereManagerfeeamtEquals(BigDecimal managerfeeamt) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MANAGERFEEAMT = ? ORDER BY MANAGERFEEAMT", new Object[] { managerfeeamt } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'OVERDUETIMES = :overduetimes'.
	 */
	public Xfactinfomain[] findWhereOverduetimesEquals(BigDecimal overduetimes) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OVERDUETIMES = ? ORDER BY OVERDUETIMES", new Object[] { overduetimes } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CLIENTACT = :clientact'.
	 */
	public Xfactinfomain[] findWhereClientactEquals(String clientact) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CLIENTACT = ? ORDER BY CLIENTACT", new Object[] { clientact } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'PAYBACKACT = :paybackact'.
	 */
	public Xfactinfomain[] findWherePaybackactEquals(String paybackact) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAYBACKACT = ? ORDER BY PAYBACKACT", new Object[] { paybackact } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'PAYBACKBANKID = :paybackbankid'.
	 */
	public Xfactinfomain[] findWherePaybackbankidEquals(String paybackbankid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAYBACKBANKID = ? ORDER BY PAYBACKBANKID", new Object[] { paybackbankid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'PAYBACKBANKNO = :paybackbankno'.
	 */
	public Xfactinfomain[] findWherePaybackbanknoEquals(String paybackbankno) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PAYBACKBANKNO = ? ORDER BY PAYBACKBANKNO", new Object[] { paybackbankno } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'RECVACT = :recvact'.
	 */
	public Xfactinfomain[] findWhereRecvactEquals(String recvact) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECVACT = ? ORDER BY RECVACT", new Object[] { recvact } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'RECVBANKID = :recvbankid'.
	 */
	public Xfactinfomain[] findWhereRecvbankidEquals(String recvbankid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECVBANKID = ? ORDER BY RECVBANKID", new Object[] { recvbankid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'RECVBANKNO = :recvbankno'.
	 */
	public Xfactinfomain[] findWhereRecvbanknoEquals(String recvbankno) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECVBANKNO = ? ORDER BY RECVBANKNO", new Object[] { recvbankno } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'RECVBANKNAME = :recvbankname'.
	 */
	public Xfactinfomain[] findWhereRecvbanknameEquals(String recvbankname) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RECVBANKNAME = ? ORDER BY RECVBANKNAME", new Object[] { recvbankname } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'OPERATORID = :operatorid'.
	 */
	public Xfactinfomain[] findWhereOperatoridEquals(String operatorid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OPERATORID = ? ORDER BY OPERATORID", new Object[] { operatorid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'OPERATEDATE = :operatedate'.
	 */
	public Xfactinfomain[] findWhereOperatedateEquals(Date operatedate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OPERATEDATE = ? ORDER BY OPERATEDATE", new Object[] { operatedate==null ? null : new java.sql.Timestamp( operatedate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CHECKERID = :checkerid'.
	 */
	public Xfactinfomain[] findWhereCheckeridEquals(String checkerid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CHECKERID = ? ORDER BY CHECKERID", new Object[] { checkerid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CHECKDATE = :checkdate'.
	 */
	public Xfactinfomain[] findWhereCheckdateEquals(Date checkdate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CHECKDATE = ? ORDER BY CHECKDATE", new Object[] { checkdate==null ? null : new java.sql.Timestamp( checkdate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CREATORID = :creatorid'.
	 */
	public Xfactinfomain[] findWhereCreatoridEquals(String creatorid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CREATORID = ? ORDER BY CREATORID", new Object[] { creatorid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CREATEDATE = :createdate'.
	 */
	public Xfactinfomain[] findWhereCreatedateEquals(Date createdate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CREATEDATE = ? ORDER BY CREATEDATE", new Object[] { createdate==null ? null : new java.sql.Timestamp( createdate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'CREATEFORM = :createform'.
	 */
	public Xfactinfomain[] findWhereCreateformEquals(String createform) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CREATEFORM = ? ORDER BY CREATEFORM", new Object[] { createform } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'UPDATORID = :updatorid'.
	 */
	public Xfactinfomain[] findWhereUpdatoridEquals(String updatorid) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UPDATORID = ? ORDER BY UPDATORID", new Object[] { updatorid } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'UPDATEDATE = :updatedate'.
	 */
	public Xfactinfomain[] findWhereUpdatedateEquals(Date updatedate) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UPDATEDATE = ? ORDER BY UPDATEDATE", new Object[] { updatedate==null ? null : new java.sql.Timestamp( updatedate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the criteria 'UPDATEFORM = :updateform'.
	 */
	public Xfactinfomain[] findWhereUpdateformEquals(String updateform) throws XfactinfomainDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE UPDATEFORM = ? ORDER BY UPDATEFORM", new Object[] { updateform } );
	}

	/**
	 * Method 'XfactinfomainDaoImpl'
	 * 
	 */
	public XfactinfomainDaoImpl()
	{
	}

	/**
	 * Method 'XfactinfomainDaoImpl'
	 * 
	 * @param userConn
	 */
	public XfactinfomainDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "CMS.XFACTINFOMAIN";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Xfactinfomain fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Xfactinfomain dto = new Xfactinfomain();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Xfactinfomain[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Xfactinfomain dto = new Xfactinfomain();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Xfactinfomain ret[] = new Xfactinfomain[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Xfactinfomain dto, ResultSet rs) throws SQLException
	{
		dto.setContractno( rs.getString( COLUMN_CONTRACTNO ) );
		dto.setPoano( rs.getString( COLUMN_POANO ) );
		dto.setStartdate( rs.getTimestamp(COLUMN_STARTDATE ) );
		dto.setEnddate( rs.getTimestamp(COLUMN_ENDDATE ) );
		dto.setDuration( rs.getBigDecimal(COLUMN_DURATION));
		dto.setCurno( rs.getString( COLUMN_CURNO ) );
		dto.setContractamt( rs.getBigDecimal(COLUMN_CONTRACTAMT));
		dto.setPrincipalamt( rs.getBigDecimal(COLUMN_PRINCIPALAMT));
		dto.setFservicecharge( rs.getBigDecimal(COLUMN_FSERVICECHARGE));
		dto.setPoastatus( rs.getBigDecimal(COLUMN_POASTATUS));
		dto.setPaybakamt( rs.getBigDecimal(COLUMN_PAYBAKAMT));
		dto.setLatefeeamt( rs.getBigDecimal(COLUMN_LATEFEEAMT));
		dto.setBreachfeeamt( rs.getBigDecimal(COLUMN_BREACHFEEAMT));
		dto.setManagerfeeamt( rs.getBigDecimal(COLUMN_MANAGERFEEAMT));
		dto.setOverduetimes( rs.getBigDecimal(COLUMN_OVERDUETIMES));
		dto.setClientact( rs.getString( COLUMN_CLIENTACT ) );
		dto.setPaybackact( rs.getString( COLUMN_PAYBACKACT ) );
		dto.setPaybackbankid( rs.getString( COLUMN_PAYBACKBANKID ) );
		dto.setPaybackbankno( rs.getString( COLUMN_PAYBACKBANKNO ) );
		dto.setRecvact( rs.getString( COLUMN_RECVACT ) );
		dto.setRecvbankid( rs.getString( COLUMN_RECVBANKID ) );
		dto.setRecvbankno( rs.getString( COLUMN_RECVBANKNO ) );
		dto.setRecvbankname( rs.getString( COLUMN_RECVBANKNAME ) );
		dto.setOperatorid( rs.getString( COLUMN_OPERATORID ) );
		dto.setOperatedate( rs.getTimestamp(COLUMN_OPERATEDATE ) );
		dto.setCheckerid( rs.getString( COLUMN_CHECKERID ) );
		dto.setCheckdate( rs.getTimestamp(COLUMN_CHECKDATE ) );
		dto.setCreatorid( rs.getString( COLUMN_CREATORID ) );
		dto.setCreatedate( rs.getTimestamp(COLUMN_CREATEDATE ) );
		dto.setCreateform( rs.getString( COLUMN_CREATEFORM ) );
		dto.setUpdatorid( rs.getString( COLUMN_UPDATORID ) );
		dto.setUpdatedate( rs.getTimestamp(COLUMN_UPDATEDATE ) );
		dto.setUpdateform( rs.getString( COLUMN_UPDATEFORM ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Xfactinfomain dto)
	{
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the specified arbitrary SQL statement
	 */
	public Xfactinfomain[] findByDynamicSelect(String sql, Object[] sqlParams) throws XfactinfomainDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new XfactinfomainDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the XFACTINFOMAIN table that match the specified arbitrary SQL statement
	 */
	public Xfactinfomain[] findByDynamicWhere(String sql, Object[] sqlParams) throws XfactinfomainDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			if (logger.isDebugEnabled()) {
				logger.debug( "Executing " + SQL);
			}
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			logger.error( "Exception: " + _e.getMessage(), _e );
			throw new XfactinfomainDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}