package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.FieldDao;
import com.test.model.Field;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class FieldDaoTest{
    
	
	@Autowired
	FieldDao fieldDao;
	
	@Test
	public void testGetFieldList(){
    	List<Field> list = fieldDao.getFieldList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateField(){
    	Field field = new Field();
    	
		fieldDao.createField(field);
	}
    
    @Test
    public void testGetFieldByPrimaryKey(){
    	//Field field = fieldDao.getFieldByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateField(){
    	Field field = new Field();
    	
		fieldDao.updateField(field);
	}
    
    @Test
	public void testDeleteField(){
		//fieldDao.deleteField();
	}
    
}