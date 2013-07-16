package com.test.model;

import java.util.Date;

public class Department{
private Integer departmentId;
private String departmentName;
private String departmentCode;
private Integer superDepartment;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Integer departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
public Integer getSuperDepartment() {
	return superDepartment;
}
public void setSuperDepartment(Integer superDepartment) {
	this.superDepartment = superDepartment;
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