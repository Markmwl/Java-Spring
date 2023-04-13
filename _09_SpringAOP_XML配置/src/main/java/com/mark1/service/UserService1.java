package com.mark1.service;

import com.mark1.aspect.InvokeLog;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {

    @InvokeLog
    public void usService()
    {
        //System.out.println(1/0);
        System.out.println("UserService.usService()核心代码！！！");
    }

    @InvokeLog
    public int usServiceByID(int Id,String Name)
    {
        //System.out.println(1/0);
        System.out.println("UserService.usServiceByID()核心代码！！！");
        return Id;
    }
}
