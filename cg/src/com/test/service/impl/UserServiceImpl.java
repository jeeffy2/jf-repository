package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
	
	public List<User> getUserList(){
		return userDao.getUserList();
	}
	public User getUserByPrimaryKey(Integer userId){
		return userDao.getUserByPrimaryKey(userId);
	}
	public void createUser(User user){
		userDao.createUser(user);
	}
	public void updateUser(User user){
		userDao.updateUser(user);
	}
	public void deleteUser(Integer userId){
		userDao.deleteUser(userId);
	}

}