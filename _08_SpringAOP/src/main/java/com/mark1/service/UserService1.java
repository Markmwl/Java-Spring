package com.mark1.service;

import com.mark1.aspect.InvokeLog;
import org.springframework.stereotype.Service;

@Service
public class UserService1 {

    @InvokeLog
    public void usService()
    {
        System.out.println("UserService.usService()核心代码！！！");
    }
}
