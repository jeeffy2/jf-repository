package com.test.model;

import java.util.Date;

public class Role{
private Integer roleId;
private String roleName;
private Integer lockCard;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}
public Integer getLockCard() {
	return lockCard;
}
public void setLockCard(Integer lockCard) {
	this.lockCard = lockCard;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public Integer getCreateBy() {
	return createBy;
}
public void setCreateBy(Integer createBy) {
	this.createBy = createBy;
}
public Date getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}
public Integer getUpdateBy() {
	return updateBy;
}
public void setUpdateBy(Integer updateBy) {
	this.updateBy = updateBy;
}
}