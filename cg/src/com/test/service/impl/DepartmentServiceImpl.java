package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.DepartmentDao;
import com.test.model.Department;
import com.test.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
	private DepartmentDao departmentDao;
	
	public List<Department> getDepartmentList(){
		return departmentDao.getDepartmentList();
	}
	public Department getDepartmentByPrimaryKey(Integer departmentId){
		return departmentDao.getDepartmentByPrimaryKey(departmentId);
	}
	public void createDepartment(Department department){
		departmentDao.createDepartment(department);
	}
	public void updateDepartment(Department department){
		departmentDao.updateDepartment(department);
	}
	public void deleteDepartment(Integer departmentId){
		departmentDao.deleteDepartment(departmentId);
	}

}