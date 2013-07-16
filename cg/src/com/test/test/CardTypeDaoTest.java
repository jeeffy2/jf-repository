package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.CardTypeDao;
import com.test.model.CardType;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class CardTypeDaoTest{
    
	
	@Autowired
	CardTypeDao cardTypeDao;
	
	@Test
	public void testGetCardTypeList(){
    	List<CardType> list = cardTypeDao.getCardTypeList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateCardType(){
    	CardType cardType = new CardType();
    	
		cardTypeDao.createCardType(cardType);
	}
    
    @Test
    public void testGetCardTypeByPrimaryKey(){
    	//CardType cardType = cardTypeDao.getCardTypeByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateCardType(){
    	CardType cardType = new CardType();
    	
		cardTypeDao.updateCardType(cardType);
	}
    
    @Test
	public void testDeleteCardType(){
		//cardTypeDao.deleteCardType();
	}
    
}