package com.test.service;

import java.util.List;
import com.test.model.Dashboard;

public interface DashboardService {

	public List<Dashboard> getDashboardList();
	public Dashboard getDashboardByPrimaryKey(Integer dashboardId);
	public void createDashboard(Dashboard dashboard);
	public void updateDashboard(Dashboard dashboard);
	public void deleteDashboard(Integer dashboardId);
}