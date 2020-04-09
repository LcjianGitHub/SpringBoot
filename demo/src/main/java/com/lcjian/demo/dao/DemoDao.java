package com.lcjian.demo.dao;

import com.lcjian.demo.dao.mapper.DemoMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DemoDao {

    @Resource
    private DemoMapper mapper;

    public Map<String, Object> getUserInfo(String id) {

        List<Map> maps = mapper.getUserInfo(id);

        return null != maps &&maps.size()>0 ?maps.get(0) : new HashMap<>();
    }
}
