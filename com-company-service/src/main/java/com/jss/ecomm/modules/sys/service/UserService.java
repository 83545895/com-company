/**
 */
package com.jss.ecomm.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.common.persistence.Page;
import com.core.common.service.CrudService;
import com.jss.ecomm.modules.sys.api.IUserService;
import com.jss.ecomm.modules.sys.dao.UserDao;
import com.jss.ecomm.modules.sys.entity.User;

/**
 * 用户Service
 * @author jss
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class UserService extends CrudService<UserDao, User> implements IUserService {

	public User get(String id) {
		return super.get(id);
	}
	
	public List<User> findList(User user) {
		return super.findList(user);
	}
	
	public Page<User> findPage(Page<User> page, User user) {
		return super.findPage(page, user);
	}
	
	@Transactional(readOnly = false)
	public void save(User user) {
		super.save(user);
	}
	
	@Transactional(readOnly = false)
	public void delete(User user) {
		super.delete(user);
	}
	
}
