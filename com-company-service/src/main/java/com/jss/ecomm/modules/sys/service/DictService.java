package com.jss.ecomm.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.service.CrudService;
import com.jss.ecomm.modules.sys.dao.DictDao;
import com.jss.ecomm.modules.sys.entity.Dict;

/**
 * 字典Service
 * @author jss
 * @version 2015-05-16
 */
@Service
@Transactional(readOnly = true)
public class DictService extends CrudService<DictDao, Dict> {
	
	/**
	 * 查询字段类型列表
	 * @return
	 */
	public List<String> findTypeList(){
		return dao.findTypeList(new Dict());
	}

	@Transactional(readOnly = false)
	public void save(Dict dict) {
		super.save(dict);
		JSSCacheUtil.remove(DictUtils.CACHE_DICT_MAP);
	}

	@Transactional(readOnly = false)
	public void delete(Dict dict) {
		super.delete(dict);
		JSSCacheUtil.remove(DictUtils.CACHE_DICT_MAP);
	}

}
