package com.mark;

import com.mark.domain.User;
import com.mark.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
       //获取对象
        Object userServices = cp.getBean("usServices");
        UserServices us = (UserServices)userServices;
        //测试
        us.ShowUser();
        System.out.println();
        us.ShowUser2(5);

        //获取对象
        Object user = cp.getBean("user");
        User user1 = (User)user;
    }
}
