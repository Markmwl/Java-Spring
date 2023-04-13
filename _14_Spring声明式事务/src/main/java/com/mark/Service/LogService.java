package com.mark.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("LogService")
public class LogService {

    @Transactional
    public void log()
    {
        System.out.println("转账成功！");
        int a = 1/0;
    }
}
