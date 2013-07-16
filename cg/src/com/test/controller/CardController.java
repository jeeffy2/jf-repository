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
import com.test.model.Card;
import com.test.service.CardService;

@RequestMapping(value="/card")
@Controller
public class CardController {
	
	private Logger log = Logger.getLogger(CardController.class);
	
	@Autowired
	private CardService cardService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<Card> list = cardService.getCardList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "card";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("cardId") Integer cardId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Card card = cardService.getCardByPrimaryKey(cardId);

            map.put("card", card);
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
    public Map<String,Object> create(@ModelAttribute Card card){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			cardService.createCard(card);
			map.put("item", card);
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
    public Map<String,Object> update(@ModelAttribute Card card){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Card oldCard = cardService.getCardByPrimaryKey(card.getCardId());
			oldCard.setCardTypeId(card.getCardTypeId());
			oldCard.setCardName(card.getCardName());
			oldCard.setRefreshTime(card.getRefreshTime());
			oldCard.setGrid(card.getGrid());
			oldCard.setPositionX(card.getPositionX());
			oldCard.setPositionY(card.getPositionY());
			oldCard.setPositionZ(card.getPositionZ());
			oldCard.setExtraAttributes(card.getExtraAttributes());
			oldCard.setIsLock(card.getIsLock());

			cardService.updateCard(oldCard);
			map.put("item", card);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer cardId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			cardService.deleteCard(cardId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}