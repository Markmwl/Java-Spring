package com.mark.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("TestService")
public class TestService {

    @Autowired
    public AccountService ac;

    @Autowired
    public LogService lg;

    @Transactional
    public void Test()
    {
        ac.SetMoney(1,2,new Double(10));

        lg.log();
    }
}
