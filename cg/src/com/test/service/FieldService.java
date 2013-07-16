package com.test.service;

import java.util.List;
import com.test.model.Field;

public interface FieldService {

	public List<Field> getFieldList();
	public Field getFieldByPrimaryKey(Integer fieldId);
	public void createField(Field field);
	public void updateField(Field field);
	public void deleteField(Integer fieldId);
}