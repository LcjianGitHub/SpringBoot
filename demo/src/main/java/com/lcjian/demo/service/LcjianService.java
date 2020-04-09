package com.lcjian.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.lcjian.demo.dao.LcjianDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LcjianService {

    @Autowired
    private LcjianDao dao;

    public JSONObject getMsg(JSONObject jsonObject) {
        JSONObject result = new JSONObject();
        result.put("desc","失败");
        result.put("code","1111");
        Map req = new HashMap();
        req.put("numId",jsonObject.getString("numId"));
        List<Map> mapList = dao.getMsg(req);
        if (null != mapList && mapList.size()>0){
            Map map = mapList.get(0);
            result.put("code","0000");
            result.put("desc","success");
            result.put("serial_number",map.getOrDefault("SERIAL_NUMBER",""));
        }
        return result;
    }
}
