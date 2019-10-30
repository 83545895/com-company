/**
 */
package com.jss.ecomm.modules.sys.dao;

import com.core.common.persistence.CrudDao;
import com.core.common.persistence.annotation.MyBatisDao;
import com.jss.ecomm.modules.sys.entity.Role;

/**
 * 角色DAO接口
 * @author jss
 * @version 2013-12-05
 */
@MyBatisDao
public interface RoleDao extends CrudDao<Role> {

	public Role getByName(Role role);
	
	public Role getByEnname(Role role);

	/**
	 * 维护角色与菜单权限关系
	 * @param role
	 * @return
	 */
	public int deleteRoleMenu(Role role);

	public int insertRoleMenu(Role role);
	
	/**
	 * 维护角色与公司部门关系
	 * @param role
	 * @return
	 */
	public int deleteRoleOffice(Role role);

	public int insertRoleOffice(Role role);

}
