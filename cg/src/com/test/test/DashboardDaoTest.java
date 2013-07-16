package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.DashboardDao;
import com.test.model.Dashboard;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class DashboardDaoTest{
    
	
	@Autowired
	DashboardDao dashboardDao;
	
	@Test
	public void testGetDashboardList(){
    	List<Dashboard> list = dashboardDao.getDashboardList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateDashboard(){
    	Dashboard dashboard = new Dashboard();
    	
		dashboardDao.createDashboard(dashboard);
	}
    
    @Test
    public void testGetDashboardByPrimaryKey(){
    	//Dashboard dashboard = dashboardDao.getDashboardByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateDashboard(){
    	Dashboard dashboard = new Dashboard();
    	
		dashboardDao.updateDashboard(dashboard);
	}
    
    @Test
	public void testDeleteDashboard(){
		//dashboardDao.deleteDashboard();
	}
    
}