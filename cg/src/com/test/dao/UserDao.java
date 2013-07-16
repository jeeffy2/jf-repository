package com.test.dao;

import java.util.List;

import com.test.model.User;

public interface UserDao {

	public List<User> getUserList();
	public User getUserByPrimaryKey(Integer userId);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer userId);
}