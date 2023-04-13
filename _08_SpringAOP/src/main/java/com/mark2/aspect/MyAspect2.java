package com.mark2.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect2 {

    //* com.mark.service.*.*(..) 切点表达式
    //返回值类型？ 任意类型 *
    //增强那些包？ com.mark.service.
    //包下的那些类？ 任意类 *.
    //类下的那些方法？ 任意方法 (..)
    @Pointcut("execution(* com.mark2.service..*.*(..))")
    public void pt() { }


    @Before("pt()")
    public void GetBefore()
    {
        System.out.println("@Before前置通知，在目标方法执行前执行！");
    }

    @AfterReturning("pt()")
    public void GetAfterReturning()
    {
        System.out.println("@AfterReturning返回后通知，在目标方法执行后执行，如果出现异常不会执行！");
    }

    @After("pt()")
    public void GetAfter()
    {
        System.out.println("@After后置通知，在目标方法返回结果之后执行，无论是否出现异常都会执行！");
    }

    @AfterThrowing("pt()")
    public void GetAfterThrowing()
    {
        System.out.println("@AfterThrowing异常通知，在目标方法抛出异常后执行！");
    }
}
