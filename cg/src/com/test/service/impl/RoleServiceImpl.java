package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.RoleDao;
import com.test.model.Role;
import com.test.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
	private RoleDao roleDao;
	
	public List<Role> getRoleList(){
		return roleDao.getRoleList();
	}
	public Role getRoleByPrimaryKey(Integer roleId){
		return roleDao.getRoleByPrimaryKey(roleId);
	}
	public void createRole(Role role){
		roleDao.createRole(role);
	}
	public void updateRole(Role role){
		roleDao.updateRole(role);
	}
	public void deleteRole(Integer roleId){
		roleDao.deleteRole(roleId);
	}

}