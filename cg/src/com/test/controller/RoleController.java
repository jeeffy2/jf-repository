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
import com.test.model.Role;
import com.test.service.RoleService;

@RequestMapping(value="/role")
@Controller
public class RoleController {
	
	private Logger log = Logger.getLogger(RoleController.class);
	
	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<Role> list = roleService.getRoleList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "role";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("roleId") Integer roleId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Role role = roleService.getRoleByPrimaryKey(roleId);

            map.put("role", role);
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
    public Map<String,Object> create(@ModelAttribute Role role){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			roleService.createRole(role);
			map.put("item", role);
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
    public Map<String,Object> update(@ModelAttribute Role role){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Role oldRole = roleService.getRoleByPrimaryKey(role.getRoleId());
			oldRole.setRoleName(role.getRoleName());
			oldRole.setLockCard(role.getLockCard());

			roleService.updateRole(oldRole);
			map.put("item", role);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer roleId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			roleService.deleteRole(roleId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}