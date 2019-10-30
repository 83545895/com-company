/**
 */
package com.jss.ecomm.modules.sys.dao;

import java.util.List;

import com.core.common.persistence.TreeDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author jss
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
	public Office getByName(String name);
	
	List<Office> findListByWebSite(Office office);
	
}
