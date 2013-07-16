package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CardDao;
import com.test.model.Card;
import com.test.service.CardService;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
	private CardDao cardDao;
	
	public List<Card> getCardList(){
		return cardDao.getCardList();
	}
	public Card getCardByPrimaryKey(Integer cardId){
		return cardDao.getCardByPrimaryKey(cardId);
	}
	public void createCard(Card card){
		cardDao.createCard(card);
	}
	public void updateCard(Card card){
		cardDao.updateCard(card);
	}
	public void deleteCard(Integer cardId){
		cardDao.deleteCard(cardId);
	}

}