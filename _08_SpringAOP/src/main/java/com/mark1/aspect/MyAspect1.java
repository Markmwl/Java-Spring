package com.mark1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect1 {

    @Pointcut("@annotation(com.mark1.aspect.InvokeLog)")
    public void pt()
    {

    }

    @Before("pt()")
    public void GetBefore()
    {
        System.out.println("方法被调用了！");
    }
}
