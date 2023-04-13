package com.mark;

import com.mark.Factory_Car.CarFactory;
import com.mark.Factory_Car.CarStaticFactory;
import com.mark.Models_Car.Car;
import com.mark.Models_Car.Dipan;
import com.mark.Models_Car.Fadongji;
import com.mark.Models_Car.Luntai;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo_car {
    public static void main(String[] args) {
        //1.直接创建对象
        Car car1 = new Car();
        car1.setDipan(new Dipan());
        car1.setFadongji(new Fadongji());
        car1.setLuntai(new Luntai());
        System.out.println("直接创建对象:"+car1);

        //2.使用实例工厂
        CarFactory carFactory =new CarFactory();
        Car car2 = carFactory.GetCarFactory();
        System.out.println("使用实例工厂:"+car2);

        //3.使用静态工厂
        Car car3 =CarStaticFactory.GetCarStaticFactory();
        System.out.println("使用静态工厂:"+car3);

        //创建容器
        ClassPathXmlApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        Car car4 = (Car)cp.getBean("car");
        System.out.println("使用Spring实例工厂:"+car4);

        Car car5 = (Car)cp.getBean("carStaticFactory");
        System.out.println("使用Spring静态工厂:"+car5);
    }
}
