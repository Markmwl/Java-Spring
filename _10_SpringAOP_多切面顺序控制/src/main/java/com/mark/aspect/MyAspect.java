package com.mark.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyAspect {

    @Pointcut("@annotation(com.mark.aspect.InvokeLog)")
    public void pt() { }

    @Before("pt()")
    public void GetBefore()
    {
        System.out.println("MyAspect自定义切面类方法被调用了！");
    }
}
