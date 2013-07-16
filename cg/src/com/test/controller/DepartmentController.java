package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.constant.Const;
import com.test.model.Department;
import com.test.service.DepartmentService;

@RequestMapping(value="/department")
@Controller
public class DepartmentController {
	
	private Logger log = Logger.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<Department> list = departmentService.getDepartmentList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "department";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("departmentId") Integer departmentId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Department department = departmentService.getDepartmentByPrimaryKey(departmentId);

            map.put("department", department);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.GET_EXCEPTION);
		}
        return map;
    }
    
    @RequestMapping(value="/create")
	@ResponseBody
    public Map<String,Object> create(@ModelAttribute Department department){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			departmentService.createDepartment(department);
			map.put("item", department);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.CREATE_EXCEPTION);
		}
        return map;
    }
    @RequestMapping(value="/update")
	@ResponseBody
    public Map<String,Object> update(@ModelAttribute Department department){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Department oldDepartment = departmentService.getDepartmentByPrimaryKey(department.getDepartmentId());
			oldDepartment.setDepartmentName(department.getDepartmentName());
			oldDepartment.setDepartmentCode(department.getDepartmentCode());
			oldDepartment.setSuperDepartment(department.getSuperDepartment());

			departmentService.updateDepartment(oldDepartment);
			map.put("item", department);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.UPDATE_EXCEPTION);
		}
        return map;
    }
    @RequestMapping(value="/delete")
	@ResponseBody
    public Map<String,Object> delete(@RequestParam("deleteId") Integer departmentId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			departmentService.deleteDepartment(departmentId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}