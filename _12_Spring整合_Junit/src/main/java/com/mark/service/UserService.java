package com.mark.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void usService()
    {
        //System.out.println(1/0);
        System.out.println("UserService.usService()核心代码！！！");
    }

    public int usServiceByID(int Id,String Name)
    {
        //System.out.println(1/0);
        System.out.println("UserService.usServiceByID()核心代码！！！");
        return Id;
    }
}
