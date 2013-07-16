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
import com.test.model.Field;
import com.test.service.FieldService;

@RequestMapping(value="/field")
@Controller
public class FieldController {
	
	private Logger log = Logger.getLogger(FieldController.class);
	
	@Autowired
	private FieldService fieldService;
	
	
	@RequestMapping
    public String list(HttpServletRequest request){
		try {
			List<Field> list = fieldService.getFieldList();
			request.setAttribute("list", list);
		} catch (Exception e) {
			log.error(e);
		}
        return "field";
    }
	
	@RequestMapping(value="/get")
	@ResponseBody
    public Map<String,Object> get(@RequestParam("fieldId") Integer fieldId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Field field = fieldService.getFieldByPrimaryKey(fieldId);

            map.put("field", field);
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
    public Map<String,Object> create(@ModelAttribute Field field){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			fieldService.createField(field);
			map.put("item", field);
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
    public Map<String,Object> update(@ModelAttribute Field field){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			Field oldField = fieldService.getFieldByPrimaryKey(field.getFieldId());
			oldField.setCardTypeId(field.getCardTypeId());
			oldField.setFieldName(field.getFieldName());
			oldField.setFieldLabel(field.getFieldLabel());
			oldField.setFieldType(field.getFieldType());
			oldField.setFieldTypeClass(field.getFieldTypeClass());
			oldField.setFieldTypeOptions(field.getFieldTypeOptions());
			oldField.setIsRequired(field.getIsRequired());

			fieldService.updateField(oldField);
			map.put("item", field);
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
    public Map<String,Object> delete(@RequestParam("deleteId") Integer fieldId){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			fieldService.deleteField(fieldId);
			map.put(Const.STATUS, Const.SUCCESS);
		} catch (Exception e) {
			log.error(e);
			map.put(Const.STATUS, Const.FAILURE);
			map.put(Const.ERROR_MESSAGE, Const.DELETE_EXCEPTION);
		}
        return map;
    }
}