package com.mark1;

import com.mark1.service.UserService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService1 userService = cp.getBean(UserService1.class);
        userService.usService();

        System.out.println("--------------------------------------------------------");
        userService.usServiceByID(2, "Marry");
    }
}
