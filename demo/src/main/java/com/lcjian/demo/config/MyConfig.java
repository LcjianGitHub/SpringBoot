package com.lcjian.demo.config;

import com.lcjian.demo.service.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration  指明这是springboot的配置类  代替之前spring的配置文件
 */
@Configuration
public class MyConfig {

    @Bean /*将方法的返回值添加到容器中，容器中这个组件的默认id是方法名*/
    public DemoService demoService(){
        System.out.println("@Bean 给容器中增加组件");
        return new DemoService();
    }
}
