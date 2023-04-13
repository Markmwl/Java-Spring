package com.mark;

import com.mark.Models.AccountModel;
import com.mark.Service.AccountService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService1 us =(AccountService1) cp.getBean("AccountService1");
        List<AccountModel> accountModelsOLD = us.GetAccount();
        System.out.println("原始金额：" + accountModelsOLD);

        us.SetMoney(1,2,new Double(10));

        List<AccountModel> accountModelsNEW = us.GetAccount();
        System.out.println("转账后金额：" + accountModelsNEW);
    }
}
