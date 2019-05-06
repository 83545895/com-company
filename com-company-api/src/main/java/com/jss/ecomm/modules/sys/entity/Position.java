/**
 * 
 */
package com.jss.ecomm.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.core.common.persistence.DataEntity;

/**
 * 职务Entity
 * @author kofi
 * @version 2017-05-05
 */
public class Position extends DataEntity<Position> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// 编码
	private String name;		// 名称
	private Integer sort;		// 排序
	//private String enterpriseId;		// 所属公司（企业）ID
	
	public Position() {
		super();
	}

	public Position(String id){
		super(id);
	}

	@Length(min=1, max=30, message="编码长度必须介于 1 和 30 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=1, max=100, message="名称长度必须介于 1和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	
}