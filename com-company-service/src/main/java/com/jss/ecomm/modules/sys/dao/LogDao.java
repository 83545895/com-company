/**
 */
package com.jss.ecomm.modules.sys.dao;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author jss
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
