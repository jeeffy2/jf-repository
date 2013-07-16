package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CardTypeDao;
import com.test.model.CardType;
import com.test.service.CardTypeService;

@Service
public class CardTypeServiceImpl implements CardTypeService {
    @Autowired
	private CardTypeDao cardTypeDao;
	
	public List<CardType> getCardTypeList(){
		return cardTypeDao.getCardTypeList();
	}
	public CardType getCardTypeByPrimaryKey(Integer cardTypeId){
		return cardTypeDao.getCardTypeByPrimaryKey(cardTypeId);
	}
	public void createCardType(CardType cardType){
		cardTypeDao.createCardType(cardType);
	}
	public void updateCardType(CardType cardType){
		cardTypeDao.updateCardType(cardType);
	}
	public void deleteCardType(Integer cardTypeId){
		cardTypeDao.deleteCardType(cardTypeId);
	}

}