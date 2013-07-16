package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.UserDao;
import com.test.model.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class UserDaoTest{
    
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void testGetUserList(){
    	List<User> list = userDao.getUserList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateUser(){
    	User user = new User();
    	
		userDao.createUser(user);
	}
    
    @Test
    public void testGetUserByPrimaryKey(){
    	//User user = userDao.getUserByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateUser(){
    	User user = new User();
    	
		userDao.updateUser(user);
	}
    
    @Test
	public void testDeleteUser(){
		//userDao.deleteUser();
	}
    
}