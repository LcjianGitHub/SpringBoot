package com.lcjian.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.lcjian.demo.pojo.Person;
import com.lcjian.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    private DemoService service;

    @RequestMapping("/aaaa")
    public String getMsg() {
        return "eeee";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    public Person getPerson() {
        return new Person();
    }

    @RequestMapping("/testOracle")
    public JSONObject getUserInfo(){
        JSONObject jsonObject = new JSONObject();
        String id = "12345";
        jsonObject = service.getUserInfo(id);

        return jsonObject;
    }
}
