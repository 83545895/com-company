/**
 */
package com.jss.ecomm.modules.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.service.TreeService;
import com.jss.ecomm.modules.sys.api.IUserService;
import com.jss.ecomm.modules.sys.dao.OfficeDao;
import com.jss.ecomm.modules.sys.entity.Office;
import com.jss.ecomm.modules.sys.entity.User;

/**
 * 机构Service
 * @author jss
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class OfficeService extends TreeService<OfficeDao, Office> {
	
	private IUserService userService;

	public List<Office> findAll(String userId){
		List<Office> officeList = null;
		User user = userService.get(userId);
        if (user.isAdmin()) {
            officeList = dao.findAllList(new Office());
        } else {
            Office office = new Office();
            office.setCurrentUser(user);
            office.getSqlMap().put("dsf", BaseService.dataScopeFilter(user, "a", ""));
            officeList = dao.findList(office);
        }
		return officeList;
	}

	public List<Office> findList(Boolean isAll){
		if (isAll != null && isAll){
			return UserUtils.getOfficeAllList();
		}else{
			return UserUtils.getOfficeList();
		}
	}
	
	@Transactional(readOnly = true)
	public List<Office> findList(Office office){
		if(office != null){
			office.setParentIds(office.getParentIds()+"%");
			return dao.findByParentIdsLike(office);
		}
		return  new ArrayList<Office>();
	}
	
	@Transactional(readOnly = false)
	public void save(Office office) {
		super.save(office);
		UserUtils.removeCache(UserUtils.CACHE_OFFICE_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Office office) {
		super.delete(office);
		UserUtils.removeCache(UserUtils.CACHE_OFFICE_LIST);
	}
	
}
