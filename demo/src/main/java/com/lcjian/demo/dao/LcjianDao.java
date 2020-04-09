package com.lcjian.demo.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LcjianDao {
    List<Map> getMsg(Map map);
}
