/**
 */
package com.jss.ecomm.modules.sys.dao;

import java.util.List;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author jss
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
