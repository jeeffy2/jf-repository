package com.test.model;

import java.util.Date;

public class Field{
private Integer fieldId;
private Integer cardTypeId;
private String fieldName;
private String fieldLabel;
private String fieldType;
private String fieldTypeClass;
private String fieldTypeOptions;
private Integer isRequired;
private Date createTime;
private Integer createBy;
private Date updateTime;
private Integer updateBy;

public Integer getFieldId() {
	return fieldId;
}
public void setFieldId(Integer fieldId) {
	this.fieldId = fieldId;
}
public Integer getCardTypeId() {
	return cardTypeId;
}
public void setCardTypeId(Integer cardTypeId) {
	this.cardTypeId = cardTypeId;
}
public String getFieldName() {
	return fieldName;
}
public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}
public String getFieldLabel() {
	return fieldLabel;
}
public void setFieldLabel(String fieldLabel) {
	this.fieldLabel = fieldLabel;
}
public String getFieldType() {
	return fieldType;
}
public void setFieldType(String fieldType) {
	this.fieldType = fieldType;
}
public String getFieldTypeClass() {
	return fieldTypeClass;
}
public void setFieldTypeClass(String fieldTypeClass) {
	this.fieldTypeClass = fieldTypeClass;
}
public String getFieldTypeOptions() {
	return fieldTypeOptions;
}
public void setFieldTypeOptions(String fieldTypeOptions) {
	this.fieldTypeOptions = fieldTypeOptions;
}
public Integer getIsRequired() {
	return isRequired;
}
public void setIsRequired(Integer isRequired) {
	this.isRequired = isRequired;
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