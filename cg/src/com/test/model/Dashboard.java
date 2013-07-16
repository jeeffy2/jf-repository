package com.test.model;

import java.util.Date;

public class Dashboard{
private Integer dashboardId;
private Integer userId;
private String dashboardName;
private String layout;
private Integer isDefault;
private Integer isShared;
private Integer source;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getDashboardId() {
	return dashboardId;
}
public void setDashboardId(Integer dashboardId) {
	this.dashboardId = dashboardId;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getDashboardName() {
	return dashboardName;
}
public void setDashboardName(String dashboardName) {
	this.dashboardName = dashboardName;
}
public String getLayout() {
	return layout;
}
public void setLayout(String layout) {
	this.layout = layout;
}
public Integer getIsDefault() {
	return isDefault;
}
public void setIsDefault(Integer isDefault) {
	this.isDefault = isDefault;
}
public Integer getIsShared() {
	return isShared;
}
public void setIsShared(Integer isShared) {
	this.isShared = isShared;
}
public Integer getSource() {
	return source;
}
public void setSource(Integer source) {
	this.source = source;
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