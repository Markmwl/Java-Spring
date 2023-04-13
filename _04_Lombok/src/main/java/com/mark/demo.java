package com.mark;

import com.mark.Models.Dog;
import com.mark.Models.User;
import lombok.val;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        User user =new User();
        user.setId(1);
        user.setName("Mark");
        System.out.println(user);

        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        Object userServices = cp.getBean("user");
        User user1 = (User) userServices;
        System.out.println(user1);

    }
}
