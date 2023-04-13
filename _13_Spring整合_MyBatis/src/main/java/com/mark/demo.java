package com.mark;

import com.mark.Service.IUserService;
import com.mark.Service.UserService.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        IUserService us =(IUserService) cp.getBean("UserService");
        System.out.println(us.selectUserAll());
    }
}
