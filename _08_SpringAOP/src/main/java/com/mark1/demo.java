package com.mark1;

import com.mark1.service.PhoneService1;
import com.mark1.service.UserService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");

        PhoneService1 phoneService = cp.getBean(PhoneService1.class);
        phoneService.phService();

        UserService1 userService = cp.getBean(UserService1.class);
        userService.usService();
    }
}
