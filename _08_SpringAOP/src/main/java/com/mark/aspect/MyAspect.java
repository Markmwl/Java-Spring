package com.mark.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    //* com.mark.service.*.*(..) 切点表达式
    //返回值类型？ 任意类型 *
    //增强那些包？ com.mark.service.
    //包下的那些类？ 任意类 *.
    //类下的那些方法？ 任意方法 (..)
    @Pointcut("execution(* com.mark.service.*.*(..))")
    public void pt()
    {

    }

    @Before("pt()")
    public void GetBefore()
    {
        System.out.println("方法被调用了！");
    }
}
