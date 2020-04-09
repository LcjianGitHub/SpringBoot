package com.lcjian.demo.service;

import com.lcjian.demo.dao.IIndoorInfoDao;
import com.lcjian.demo.pojo.IndoorCheckItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ControllerService {

	@Autowired
	private IIndoorInfoDao dao;
	
	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities() {
		System.out.println("service");
		return dao.getWscheckItemsOfIndoor();
	}
}
