/**
 * 
 */
package com.jss.ecomm.modules.sys.entity;

import javax.validation.constraints.NotNull;

import com.core.common.persistence.DataEntity;

/**
 * 用户职务关联Entity
 * @author kofi
 * @version 2017-05-05
 */
public class UserPosition extends DataEntity<UserPosition> {
	
	private static final long serialVersionUID = 1L;
	private User user;		// 用户id
	private Position position;		// 职务id
	
	public UserPosition() {
		super();
	}

	public UserPosition(String id){
		super(id);
	}
	
	public UserPosition(User user){
		this();
		this.user = user;
	}

	@NotNull(message="用户id不能为空")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@NotNull(message="职务id不能为空")
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
}