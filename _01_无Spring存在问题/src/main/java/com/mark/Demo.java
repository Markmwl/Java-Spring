package com.mark;

import com.mark.services.UserServices;
import com.mark.services.impl.UserServicesImpl;

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello!");

        //从中我们可以看出来，若需求变更，我们需要将UserDaoImpl1变更到UserDaoImpl2，需要更新services层文件，不利于维护，所以借此将使用反射来调用类对象
        UserServices userServices = new UserServicesImpl();
        userServices.ShowUser();
    }
}
