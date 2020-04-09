package com.lcjian.demo.controller;


import com.lcjian.demo.pojo.IndoorCheckItemEntity;
import com.lcjian.demo.service.ControllerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping("/controller")

public class HelloWorldController {

	private final  Logger logger = (Logger) LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public  String hello() {
		
		String data = "this is 333 ";
		return data;
	}	
	@Resource
	private ControllerService service;
	@RequestMapping(value="/getIndoorCheckItemEntities",method= RequestMethod.GET)
	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities(){
		logger.debug("start request data");
		System.out.println("controller");
		return service.getIndoorCheckItemEntities();
	}
}



