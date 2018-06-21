package com.x.sso.client.filter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * BaaS 项目 SSOUser 单点登录成功后的User实体
 *
 * Date: 2016年3月16日 <br>
 * Copyright (c) 2016 ifudata.com <br>
 * @author wangyongxin
 */
public class SSOClientUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 708084167362525740L;
	/**
	 * 租户id
	 */
	private String tenantId;
	/**
	 * 账号ID 对应中信sys_user表的主键id
	 */
	private String userId;

	/**
	 * 登录名
	 */
	private String loginName;

	/**
	 * 密码（数据库中的密文）
	 */
	private String loginPassword;

	/**
	 * 手机
	 */
	private String mobile;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 归属公司
	 */
	private String companyId;

	/**
	 * 归属部门
	 */
	private String officeId;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 部门
	 */
	private String category;
	/**
	 * 是否允许登录
	 */
	private String loginFlag;
	/**
	 * 是否已标记删除
	 */
	private String delFlag;
	/**
	 * 生效时间
	 */
	private Timestamp effectiveDate;
	/**
	 * 失效时间
	 */
	private Timestamp expiryDate;
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public Timestamp getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Timestamp effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Timestamp getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	

}
