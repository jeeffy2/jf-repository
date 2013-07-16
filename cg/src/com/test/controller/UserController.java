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
import com.test.model.User;
import com.test.service.UserService;

@RequestMapping(value="/user")
@Controller
public class UserController {
	
	private Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<User> list = userService.getUserList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "user";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("userId") Integer userId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			User user = userService.getUserByPrimaryKey(userId);

            map.put("user", user);
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
    public Map<String,Object> create(@ModelAttribute User user){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			userService.createUser(user);
			map.put("item", user);
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
    public Map<String,Object> update(@ModelAttribute User user){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			User oldUser = userService.getUserByPrimaryKey(user.getUserId());
			oldUser.setDepartmentId(user.getDepartmentId());
			oldUser.setUserName(user.getUserName());
			oldUser.setPassword(user.getPassword());
			oldUser.setEmail(user.getEmail());
			oldUser.setPhone(user.getPhone());
			oldUser.setMobile(user.getMobile());

			userService.updateUser(oldUser);
			map.put("item", user);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer userId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			userService.deleteUser(userId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}