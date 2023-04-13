package com.mark1.service;

import com.mark1.aspect.InvokeLog;
import org.springframework.stereotype.Service;

@Service
public class PhoneService1 {

    @InvokeLog
    public void phService()
    {
        System.out.println("PhoneService.phService()核心代码！！！");
    }
}
