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
import com.test.model.CardType;
import com.test.service.CardTypeService;

@RequestMapping(value="/cardType")
@Controller
public class CardTypeController {
	
	private Logger log = Logger.getLogger(CardTypeController.class);
	
	@Autowired
	private CardTypeService cardTypeService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<CardType> list = cardTypeService.getCardTypeList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "cardType";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("cardTypeId") Integer cardTypeId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			CardType cardType = cardTypeService.getCardTypeByPrimaryKey(cardTypeId);

            map.put("cardType", cardType);
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
    public Map<String,Object> create(@ModelAttribute CardType cardType){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			cardTypeService.createCardType(cardType);
			map.put("item", cardType);
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
    public Map<String,Object> update(@ModelAttribute CardType cardType){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			CardType oldCardType = cardTypeService.getCardTypeByPrimaryKey(cardType.getCardTypeId());
			oldCardType.setCardTypeName(cardType.getCardTypeName());
			oldCardType.setLogoName(cardType.getLogoName());
			oldCardType.setDescription(cardType.getDescription());
			oldCardType.setGrids(cardType.getGrids());
			oldCardType.setCategory(cardType.getCategory());

			cardTypeService.updateCardType(oldCardType);
			map.put("item", cardType);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer cardTypeId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			cardTypeService.deleteCardType(cardTypeId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}