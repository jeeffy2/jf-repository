package com.test.dao;

import java.util.List;

import com.test.model.CardType;

public interface CardTypeDao {

	public List<CardType> getCardTypeList();
	public CardType getCardTypeByPrimaryKey(Integer cardTypeId);
	public void createCardType(CardType cardType);
	public void updateCardType(CardType cardType);
	public void deleteCardType(Integer cardTypeId);
}