package com.test.model;

import java.util.Date;

public class Card{
private Integer cardId;
private Integer cardTypeId;
private String cardName;
private Integer refreshTime;
private String grid;
private Long positionX;
private Integer positionY;
private Integer positionZ;
private String extraAttributes;
private Integer isLock;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getCardId() {
	return cardId;
}
public void setCardId(Integer cardId) {
	this.cardId = cardId;
}
public Integer getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(Integer cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public String getCardName() {
	return cardName;
}
public void setCardName(String cardName) {
	this.cardName = cardName;
}
public Integer getRefreshTime() {
	return refreshTime;
}
public void setRefreshTime(Integer refreshTime) {
	this.refreshTime = refreshTime;
}
public String getGrid() {
	return grid;
}
public void setGrid(String grid) {
	this.grid = grid;
}
public Long getPositionX() {
	return positionX;
}
public void setPositionX(Long positionX) {
	this.positionX = positionX;
}
public Integer getPositionY() {
	return positionY;
}
public void setPositionY(Integer positionY) {
	this.positionY = positionY;
}
public Integer getPositionZ() {
	return positionZ;
}
public void setPositionZ(Integer positionZ) {
	this.positionZ = positionZ;
}
public String getExtraAttributes() {
	return extraAttributes;
}
public void setExtraAttributes(String extraAttributes) {
	this.extraAttributes = extraAttributes;
}
public Integer getIsLock() {
	return isLock;
}
public void setIsLock(Integer isLock) {
	this.isLock = isLock;
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