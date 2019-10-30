/**
 */
package com.jss.ecomm.modules.sys.dao;

import com.core.common.persistence.TreeDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author jss
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
