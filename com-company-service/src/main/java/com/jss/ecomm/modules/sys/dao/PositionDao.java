/**
 * 
 */
package com.jss.ecomm.modules.sys.dao;

import java.util.List;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Position;
import com.jss.ecomm.modules.sys.entity.User;

/**
 * 职务DAO接口
 * @author kofi
 * @version 2017-05-05
 */
@MyBatisDao
public interface PositionDao extends CrudDao<Position> {
	
	List<Position> findListByUser(User user);
	
}