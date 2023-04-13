package com.mark;

import com.mark.Service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        TestService us =(TestService) cp.getBean("TestService");
        us.Test();
    }
}
