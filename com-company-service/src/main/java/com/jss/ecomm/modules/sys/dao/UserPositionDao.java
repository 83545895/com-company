/**
 * 
 */
package com.jss.ecomm.modules.sys.dao;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.UserPosition;

/**
 * 用户职务关联DAO接口
 * @author kofi
 * @version 2017-05-05
 */
@MyBatisDao
public interface UserPositionDao extends CrudDao<UserPosition> {
	
}