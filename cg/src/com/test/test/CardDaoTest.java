package com.test.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dao.CardDao;
import com.test.model.Card;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:WebContent/WEB-INF/spring-test-config.xml","file:WebContent/WEB-INF/mybatis-config.xml","file:WebContent/WEB-INF/springmvc-servlet.xml"})
public class CardDaoTest{
    
	
	@Autowired
	CardDao cardDao;
	
	@Test
	public void testGetCardList(){
    	List<Card> list = cardDao.getCardList();
		Assert.assertTrue(list.size()>0);
	}
	
    @Test
	public void testCreateCard(){
    	Card card = new Card();
    	
		cardDao.createCard(card);
	}
    
    @Test
    public void testGetCardByPrimaryKey(){
    	//Card card = cardDao.getCardByPrimaryKey(Integer();
    }

    @Test
	public void testUpdateCard(){
    	Card card = new Card();
    	
		cardDao.updateCard(card);
	}
    
    @Test
	public void testDeleteCard(){
		//cardDao.deleteCard();
	}
    
}