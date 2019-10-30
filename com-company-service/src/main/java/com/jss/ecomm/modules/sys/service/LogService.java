/**
 */
package com.jss.ecomm.modules.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.persistence.Page;
import com.core.common.service.CrudService;
import com.core.common.utils.DateUtils;
import com.jss.ecomm.modules.sys.dao.LogDao;
import com.jss.ecomm.modules.sys.entity.Log;

/**
 * 日志Service
 * @author jss
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class LogService extends CrudService<LogDao, Log> {

	public Page<Log> findPage(Page<Log> page, Log log) {
		
		// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		
		return super.findPage(page, log);
		
	}
	
}
