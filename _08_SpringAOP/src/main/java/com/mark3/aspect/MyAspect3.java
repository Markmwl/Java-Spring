package com.mark3.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect3 {

    //* com.mark.service.*.*(..) 切点表达式
    //返回值类型？ 任意类型 *
    //增强那些包？ com.mark.service.
    //包下的那些类？ 任意类 *.
    //类下的那些方法？ 任意方法 (..)
    @Pointcut("execution(* com.mark3.service..*.*(..))")
    public void pt() { }

    @Around("pt()")
    public void GetAround(ProceedingJoinPoint joinPoint)
    {
        System.out.println("@Before 前置通知  优先级1");
        try {
            joinPoint.proceed();
            System.out.println("@AfterReturning 返回后通知  优先级2");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("@AfterThrowing 异常通知  优先级2");
        }finally {
            System.out.println("@After 后置通知  优先级3");
        }
    }
}
