package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.RoleDao;
import com.test.model.Role;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class RoleDaoTest{
    
	
	@Autowired
	RoleDao roleDao;
	
	@Test
	public void testGetRoleList(){
    	List<Role> list = roleDao.getRoleList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateRole(){
    	Role role = new Role();
    	
		roleDao.createRole(role);
	}
    
    @Test
    public void testGetRoleByPrimaryKey(){
    	//Role role = roleDao.getRoleByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateRole(){
    	Role role = new Role();
    	
		roleDao.updateRole(role);
	}
    
    @Test
	public void testDeleteRole(){
		//roleDao.deleteRole();
	}
    
}