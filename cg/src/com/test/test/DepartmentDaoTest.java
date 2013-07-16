package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.DepartmentDao;
import com.test.model.Department;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class DepartmentDaoTest{
    
	
	@Autowired
	DepartmentDao departmentDao;
	
	@Test
	public void testGetDepartmentList(){
    	List<Department> list = departmentDao.getDepartmentList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateDepartment(){
    	Department department = new Department();
    	
		departmentDao.createDepartment(department);
	}
    
    @Test
    public void testGetDepartmentByPrimaryKey(){
    	//Department department = departmentDao.getDepartmentByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateDepartment(){
    	Department department = new Department();
    	
		departmentDao.updateDepartment(department);
	}
    
    @Test
	public void testDeleteDepartment(){
		//departmentDao.deleteDepartment();
	}
    
}