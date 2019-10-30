/**
 * 
 */
package com.jss.ecomm.modules.sys.dao;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.VersionApp;

/**
 * APP版本表DAO接口
 * @author kofi
 * @version 2016-12-29
 */
@MyBatisDao
public interface VersionAppDao extends CrudDao<VersionApp> {
	
}