package com.mark;

import com.mark.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class demo1 {
    public static void main(String[] args) {
        Enhancer eh = new Enhancer();
        //设置父类字节码对象
        eh.setSuperclass(UserService.class);
        eh.setCallback(new MethodInterceptor() {
            //使用代理对象执行方法时都会调用到intercept方法
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //判断当前方法是否是usServiceByID
                if ("usServiceByID".equals(method.getName()))
                {
                    System.out.println("usServiceByID被增强了！");
                }
                //调用父类中对应方法
                Object ret = methodProxy.invokeSuper(o, objects);
                return ret;
            }
        });
        //生成代理对象
        UserService userService= (UserService) eh.create();
        userService.usService();
        String usServiceByID = userService.usServiceByID(1, "Mark");
        System.out.println(usServiceByID);
    }
}
