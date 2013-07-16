package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.DashboardDao;
import com.test.model.Dashboard;
import com.test.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
	private DashboardDao dashboardDao;
	
	public List<Dashboard> getDashboardList(){
		return dashboardDao.getDashboardList();
	}
	public Dashboard getDashboardByPrimaryKey(Integer dashboardId){
		return dashboardDao.getDashboardByPrimaryKey(dashboardId);
	}
	public void createDashboard(Dashboard dashboard){
		dashboardDao.createDashboard(dashboard);
	}
	public void updateDashboard(Dashboard dashboard){
		dashboardDao.updateDashboard(dashboard);
	}
	public void deleteDashboard(Integer dashboardId){
		dashboardDao.deleteDashboard(dashboardId);
	}

}