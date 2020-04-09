package com.lcjian.demo.dao;

import com.lcjian.demo.pojo.IndoorCheckItemEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IIndoorInfoDao {
	ArrayList<IndoorCheckItemEntity> getWscheckItemsOfIndoor();
}
