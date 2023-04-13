package com.mark;

import com.mark.Models.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo_user {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        Object ds = cp.getBean("user");
        User us =(User) ds;
        System.out.println(us);
        cp.close();
    }
}
