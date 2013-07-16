package com.test.model;

import java.util.Date;

public class CardType{
private Integer cardTypeId;
private String cardTypeName;
private String logoName;
private String description;
private String grids;
private String category;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(Integer cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public String getCardTypeName() {
	return cardTypeName;
}
public void setCardTypeName(String cardTypeName) {
	this.cardTypeName = cardTypeName;
}
public String getLogoName() {
	return logoName;
}
public void setLogoName(String logoName) {
	this.logoName = logoName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getGrids() {
	return grids;
}
public void setGrids(String grids) {
	this.grids = grids;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
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