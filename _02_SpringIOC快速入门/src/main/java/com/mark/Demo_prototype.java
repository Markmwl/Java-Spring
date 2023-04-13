package com.mark;

import com.mark.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo_prototype {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
       //获取对象
        Object userServices = cp.getBean("userServices");
        UserServices us = (UserServices)userServices;
        //测试
        us.ShowUser();
        System.out.println();
        us.ShowUser2(5);

        //获取对象
        Object userServices1 = cp.getBean("userServices");
        UserServices us1 = (UserServices)userServices;
        //测试
        us1.ShowUser();
        System.out.println();
        us1.ShowUser2(5);
    }
}
