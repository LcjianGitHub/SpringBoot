package com.lcjian.demo.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {
    List<Map> getUserInfo(String id);
}
