package com.mark5;

import com.mark5.service.UserService5;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService5 userService = cp.getBean(UserService5.class);
        userService.usService();
        System.out.println("--------------------------------------------------------");
        int byID = userService.usServiceByID(2, "Marry");
        System.out.println("现返回值："+byID);
    }
}
