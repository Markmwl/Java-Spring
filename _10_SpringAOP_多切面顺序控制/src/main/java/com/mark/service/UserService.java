package com.mark.service;

import com.mark.aspect.InvokeLog;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @InvokeLog
    public void usService()
    {
        System.out.println("UserService.usService()核心代码！！！");
    }
}
