package com.mark;

import com.mark.service.PhoneService;
import com.mark.service.UserService;
import com.mark.service.childService.CarService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
    public static void main(String[] args) {
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");

        PhoneService phoneService = cp.getBean(PhoneService.class);
        phoneService.phService();

        UserService userService = cp.getBean(UserService.class);
        userService.usService();

        CarService carService = cp.getBean(CarService.class);
        carService.carService(2);
    }
}
