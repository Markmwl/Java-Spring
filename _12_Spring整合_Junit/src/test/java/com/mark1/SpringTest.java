package com.mark1;

import com.mark.service.UserService;
import com.mark1.Config.ApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//让测试运行与Spring测试环境
@ContextConfiguration(classes = ApplicationConfig.class)//若使用注解方式来实现用classes指向注解类就行
public class SpringTest {
    //想测那个对象，就注入那个对象
    @Autowired
    public UserService usService;

    //定义测试方法
    @Test
    public void  Test()
    {
        usService.usService();
    }
}
