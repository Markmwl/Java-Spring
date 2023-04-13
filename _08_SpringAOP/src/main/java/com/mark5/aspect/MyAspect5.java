package com.mark5.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect5 {

    //* com.mark.service.*.*(..) 切点表达式
    //返回值类型？ 任意类型 *
    //增强那些包？ com.mark.service.
    //包下的那些类？ 任意类 *.
    //类下的那些方法？ 任意方法 (..)
    @Pointcut("execution(* com.mark5.service..*.*(..))")
    public void pt() { }


    @Around("pt()")
    public Object GetAround(ProceedingJoinPoint joinPoint)
    {
        System.out.println("@Before 前置通知  优先级1");
        Object[] args = joinPoint.getArgs();//获取参数列表
        Object target = joinPoint.getTarget();//被代理对象
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();//获取被增强方法签名封装的对象
        String name = signature.getName();
        String[] parameterNames = signature.getParameterNames();
        Class[] parameterTypes = signature.getParameterTypes();
        Object ret = null;
        try {
            ret = joinPoint.proceed();//ret就是目标方法执行后的返回值
            System.out.println("@AfterReturning 返回后通知  优先级2");
            System.out.println("return："+ret);
        } catch (Throwable throwable) {
            System.out.println("@AfterThrowing 异常通知  优先级2");
            throwable.printStackTrace();//throwable就是出现异常时的异常对象
            System.out.println("异常通知消息："+throwable.getMessage());
        }finally {
            System.out.println("@After 后置通知  优先级3");
        }
        System.out.println("目标原来返回值："+ret);
        return 5;
        //return ret;

    }
}
