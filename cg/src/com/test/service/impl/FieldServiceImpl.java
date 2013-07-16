package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.FieldDao;
import com.test.model.Field;
import com.test.service.FieldService;

@Service
public class FieldServiceImpl implements FieldService {
    @Autowired
	private FieldDao fieldDao;
	
	public List<Field> getFieldList(){
		return fieldDao.getFieldList();
	}
	public Field getFieldByPrimaryKey(Integer fieldId){
		return fieldDao.getFieldByPrimaryKey(fieldId);
	}
	public void createField(Field field){
		fieldDao.createField(field);
	}
	public void updateField(Field field){
		fieldDao.updateField(field);
	}
	public void deleteField(Integer fieldId){
		fieldDao.deleteField(fieldId);
	}

}