package com.test.dao;

import java.util.List;

import com.test.model.Department;

public interface DepartmentDao {

	public List<Department> getDepartmentList();
	public Department getDepartmentByPrimaryKey(Integer departmentId);
	public void createDepartment(Department department);
	public void updateDepartment(Department department);
	public void deleteDepartment(Integer departmentId);
}