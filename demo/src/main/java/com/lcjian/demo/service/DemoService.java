package com.lcjian.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lcjian.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DemoService {

    @Autowired
    private DemoDao dao;

    public JSONObject getUserInfo(String id) {

        Map<String,Object> map = new HashMap<>();

        map= dao.getUserInfo(id);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("SERIAL_NUMBER",map.get("SERIAL_NUMBER"));



        return jsonObject;
    }
}
