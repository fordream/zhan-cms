/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package zt.cms.xf.common.factory;

import java.sql.Connection;
import zt.cms.xf.common.dao.*;
import zt.cms.xf.common.jdbc.*;

public class XfactinfomainDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return XfactinfomainDao
	 */
	public static XfactinfomainDao create()
	{
		return new XfactinfomainDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return XfactinfomainDao
	 */
	public static XfactinfomainDao create(Connection conn)
	{
		return new XfactinfomainDaoImpl( conn );
	}

}
