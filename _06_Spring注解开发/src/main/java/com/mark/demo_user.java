package com.mark;

import com.mark.Dao.IUserDao;
import com.mark.Models.User;
import com.mark.Service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo_user {
    public static void main(String[] args) throws Exception {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        User us =(User) cp.getBean("user");
        System.out.println(us);

        IUserService userService = (IUserService)cp.getBean("userService");
        userService.UserServiceData();

        IUserDao userDao = (IUserDao)cp.getBean("userDao");
        userDao.GetUserData();

        //关闭容器对象
        cp.close();
    }
}
