package com.mark;

import com.mark.service.IUserService;
import com.mark.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class demo {
    public static void main(String[] args) {
        //实例调用
        IUserService us = new UserService();
        //us.usService();

        //使用动态代理增强usService方法
        //1.使用JDK动态代理
        //获取类加载器
        ClassLoader classLoader = demo.class.getClassLoader();
        //被代理类所实现接口的字节码对象数组
        Class<?>[] interfaces = UserService.class.getInterfaces();
        IUserService o = (IUserService)Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            //使用代理对象的Invoke方法时 会调用到Invoke
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //proxy：代理对象
                //method：当前被调用的方法封装的Method对象
                //args：调用方法时传入的参数

                //调用被代理对象的对应方法
                //判断当前方法是否是usServiceByID
                if (method.getName().equals("usServiceByID"))
                {
                    System.out.println("usServiceByID被增强了！");
                }
                return method.invoke(us,args);
            }
        });
        o.usService();

        String usServiceByID = o.usServiceByID(1, "Mark");
        System.out.println(usServiceByID.toString());
    }
}
