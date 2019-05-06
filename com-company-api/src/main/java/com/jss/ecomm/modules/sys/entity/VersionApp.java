/**
 * 
 */
package com.jss.ecomm.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.core.common.persistence.DataEntity;

/**
 * APP版本表Entity
 * @author kofi
 * @version 2016-12-29
 */
public class VersionApp extends DataEntity<VersionApp> {
	
	private static final long serialVersionUID = 1L;
	private String clientCls;		// 客户端种类（0：企业版、1：个人版）
	private String clientType;		// 客户端类型（Android、ios）
	private String version;		// 版本号
	private String versionName;		// 版本名称
	private String descr;		// 描述
	private String packageSize;		// 包大小（MB）
	private String dloadUrl;		// 下载地址
	
	public VersionApp() {
		super();
	}

	public VersionApp(String id){
		super(id);
	}

	@Length(min=0, max=20, message="客户端种类（0：企业版、1：个人版）长度必须介于 0 和 20 之间")
	public String getClientCls() {
		return clientCls;
	}

	public void setClientCls(String clientCls) {
		this.clientCls = clientCls;
	}
	
	@Length(min=0, max=20, message="客户端类型（Android、ios）长度必须介于 0 和 20 之间")
	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
	@Length(min=0, max=20, message="版本号长度必须介于 0 和 20 之间")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Length(min=0, max=20, message="版本名称长度必须介于 0 和 20 之间")
	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
	@Length(min=0, max=20, message="描述长度必须介于 0 和 20 之间")
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	@Length(min=0, max=20, message="包大小（MB）长度必须介于 0 和 20 之间")
	public String getPackageSize() {
		return packageSize;
	}

	public void setPackageSize(String packageSize) {
		this.packageSize = packageSize;
	}
	
	@Length(min=0, max=200, message="下载地址长度必须介于 0 和 200 之间")
	public String getDloadUrl() {
		return dloadUrl;
	}

	public void setDloadUrl(String dloadUrl) {
		this.dloadUrl = dloadUrl;
	}
	
}