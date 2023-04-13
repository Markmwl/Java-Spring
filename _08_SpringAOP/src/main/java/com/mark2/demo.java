package com.mark2;

import com.mark2.service.UserService2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService2 userService = cp.getBean(UserService2.class);
        userService.usService();
    }
}
