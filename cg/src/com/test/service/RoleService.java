package com.test.service;

import java.util.List;
import com.test.model.Role;

public interface RoleService {

	public List<Role> getRoleList();
	public Role getRoleByPrimaryKey(Integer roleId);
	public void createRole(Role role);
	public void updateRole(Role role);
	public void deleteRole(Integer roleId);
}