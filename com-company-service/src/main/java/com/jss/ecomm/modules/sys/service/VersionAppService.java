/**
 * 
 */
package com.jss.ecomm.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.persistence.Page;
import com.core.common.service.CrudService;
import com.jss.ecomm.modules.sys.dao.VersionAppDao;
import com.jss.ecomm.modules.sys.entity.VersionApp;

/**
 * APP版本表Service
 * @author kofi
 * @version 2016-12-29
 */
@Service
@Transactional(readOnly = true)
public class VersionAppService extends CrudService<VersionAppDao, VersionApp> {

	public VersionApp get(String id) {
		return super.get(id);
	}
	
	public List<VersionApp> findList(VersionApp versionApp) {
		return super.findList(versionApp);
	}
	
	public Page<VersionApp> findPage(Page<VersionApp> page, VersionApp versionApp) {
		return super.findPage(page, versionApp);
	}
	
	@Transactional(readOnly = false)
	public void save(VersionApp versionApp) {
		super.save(versionApp);
	}
	
	@Transactional(readOnly = false)
	public void delete(VersionApp versionApp) {
		super.delete(versionApp);
	}
	
}