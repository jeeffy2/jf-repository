package com.test.service;

import java.util.List;
import com.test.model.Card;

public interface CardService {

	public List<Card> getCardList();
	public Card getCardByPrimaryKey(Integer cardId);
	public void createCard(Card card);
	public void updateCard(Card card);
	public void deleteCard(Integer cardId);
}