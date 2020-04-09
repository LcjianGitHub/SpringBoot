package com.lcjian.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lcjian.demo.service.LcjianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lcjian")
public class LcjianController {

    @Autowired
    private LcjianService service;

    @RequestMapping("/test")
    public JSONObject getMsg(@RequestBody JSONObject jsonObject){
        jsonObject = service.getMsg(jsonObject);
        return jsonObject;
    }
}
