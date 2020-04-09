package com.lcjian.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:bean.xml")   /*让spring 的配置文件生效，加载进来   spring boot 不建议使用      springboot建议使用注解增加组件*/
@SpringBootApplication
@MapperScan({"com.lcjian.demo.dao","com.lcjian.demo.dao.mapper"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
