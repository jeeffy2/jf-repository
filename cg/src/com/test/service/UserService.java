package com.test.service;

import java.util.List;
import com.test.model.User;

public interface UserService {

	public List<User> getUserList();
	public User getUserByPrimaryKey(Integer userId);
	public void createUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer userId);
}