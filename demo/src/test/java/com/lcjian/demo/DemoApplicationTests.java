package com.lcjian.demo;

import com.lcjian.demo.controller.DemoController;
import com.lcjian.demo.pojo.Dog;
import com.lcjian.demo.pojo.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    Person person;

    @Autowired
    Dog dog;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void demoService(){
        boolean b = ioc.containsBean("demoService");   //测试ioc容器中是否包含demoService这个bean
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
        System.out.println(dog.toString());
    }

    //初始化执行
    @Before
    public void setUp()throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }

    //验证controller是否正常响应并打印返回结果
    @Test
    public void getTest()throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/testOracle").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
