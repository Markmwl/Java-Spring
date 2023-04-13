package com.mark.service;

public class UserService implements IUserService {

    public void usService()
    {
        System.out.println("UserService.usService()核心代码！！！");
    }

    public String usServiceByID(int Id,String Name)
    {
        //System.out.println(1/0);
        System.out.println("UserService.usServiceByID()核心代码！！！");
        return Id +"："+ Name;
    }
}
