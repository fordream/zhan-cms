/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package zt.cms.xf.common.dao;

import zt.cms.xf.common.dto.Xfvconfirmprtinfo;
import zt.cms.xf.common.exceptions.XfvcontractprtinfoDaoException;

public interface XfvconfirmprtinfoDao
{
	public Xfvconfirmprtinfo findWhereAppnoEquals(String appno) throws XfvcontractprtinfoDaoException;
}
