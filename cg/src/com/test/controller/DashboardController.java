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
import com.test.model.Dashboard;
import com.test.service.DashboardService;

@RequestMapping(value="/dashboard")
@Controller
public class DashboardController {
	
	private Logger log = Logger.getLogger(DashboardController.class);
	
	@Autowired
	private DashboardService dashboardService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<Dashboard> list = dashboardService.getDashboardList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "dashboard";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("dashboardId") Integer dashboardId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Dashboard dashboard = dashboardService.getDashboardByPrimaryKey(dashboardId);

            map.put("dashboard", dashboard);
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
    public Map<String,Object> create(@ModelAttribute Dashboard dashboard){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			dashboardService.createDashboard(dashboard);
			map.put("item", dashboard);
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
    public Map<String,Object> update(@ModelAttribute Dashboard dashboard){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Dashboard oldDashboard = dashboardService.getDashboardByPrimaryKey(dashboard.getDashboardId());
			oldDashboard.setUserId(dashboard.getUserId());
			oldDashboard.setDashboardName(dashboard.getDashboardName());
			oldDashboard.setLayout(dashboard.getLayout());
			oldDashboard.setIsDefault(dashboard.getIsDefault());
			oldDashboard.setIsShared(dashboard.getIsShared());
			oldDashboard.setSource(dashboard.getSource());

			dashboardService.updateDashboard(oldDashboard);
			map.put("item", dashboard);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer dashboardId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			dashboardService.deleteDashboard(dashboardId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}