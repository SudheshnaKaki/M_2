package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.QueryMaster;
import com.cg.service.IGearService;

@Controller
public class MyController {
	@Autowired
	IGearService gearService;
	QueryMaster queryMaster = null;
	
    @RequestMapping(value="all")
	public String home() {
		return "home";
	}
    @RequestMapping(value="search", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam("query_Id") int id) {
    	
    	System.out.println(id);
    	QueryMaster bean = null;
    	bean = gearService.search(id);
    	queryMaster =  bean;
    	if(bean == null){
    		return new ModelAndView("error", "edata",id);
    	}
    	else {
    		return new ModelAndView("update", "data", bean);
    	}
	}
    @RequestMapping(value="success", method = RequestMethod.GET)
    public ModelAndView success(@RequestParam("solutions") String solutions){
		System.out.println(solutions);
		queryMaster.setSolutions(solutions);
		gearService.addQuery(queryMaster);
		return new ModelAndView("success","data",queryMaster);
    	
    }
	
}
