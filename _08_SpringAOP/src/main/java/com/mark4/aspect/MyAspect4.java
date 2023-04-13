package com.mark4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
public class MyAspect4 {

    //* com.mark.service.*.*(..) 切点表达式
    //返回值类型？ 任意类型 *
    //增强那些包？ com.mark.service.
    //包下的那些类？ 任意类 *.
    //类下的那些方法？ 任意方法 (..)
    @Pointcut("execution(* com.mark4.service..*.*(..))")
    public void pt() { }


    @Before("pt()")
    public void GetBefore(JoinPoint joinPoint)
    {
        Object[] args = joinPoint.getArgs();//方法调用时传入的参数
        Object target = joinPoint.getTarget();//被代理对象
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();//获取被增强方法签名封装的对象
        String[] names = signature.getParameterNames();//参数列表名称
        Class[] types = signature.getParameterTypes();//参数列表类型
        String name = signature.getName();//获取方法名称
        System.out.println("@Before前置通知，在目标方法执行前执行！"+Arrays.toString(args));
    }

    @AfterReturning(value = "pt()",returning = "ret")//使用returning属性指定了把目标返回值赋值给下面方法的参数ret
    public void GetAfterReturning(JoinPoint joinPoint,Object ret)
    {
        System.out.println("@AfterReturning返回后通知，在目标方法执行后执行，如果出现异常不会执行！");
        System.out.println("return："+ret);
    }

    @After("pt()")
    public void GetAfter()
    {
        System.out.println("@After后置通知，在目标方法返回结果之后执行，无论是否出现异常都会执行！");
    }

    @AfterThrowing(value = "pt()",throwing = "thw")//使用throwing属性指定了把出现的异常对象赋值给下面方法的参数thw
    public void GetAfterThrowing(JoinPoint joinPoint,Throwable thw)
    {
        System.out.println("@AfterThrowing异常通知，在目标方法抛出异常后执行！");
        System.out.println(thw.getMessage());
    }
}
