package com.mark;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws Exception {
        //以前写法
        OracleDataSource dataSource = null;
        //使用官方OracleDataSource可以不必注册驱动
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        dataSource = new OracleDataSource();
        dataSource.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
        dataSource.setUser("Mark");
        dataSource.setPassword("123456");
        System.out.println(dataSource.getClass().getName());
        Connection con = dataSource.getConnection();
        System.out.println(con.getClass().getName());
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from 用户表");
        while(rs.next()) {
            System.out.println("姓名:"+rs.getObject("NAME")+","+"地址:"+rs.getObject("AddRESS"));
        }
        con.close();
        stmt.close();
        rs.close();
        System.out.println("--------------------------------Spring写法-------------------------------------------");
        //创建容器 注意：ApplicationContext是ClassPathXmlApplicationContext的父类，也可以直接使用ClassPathXmlApplicationContext。
        ApplicationContext cp =new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        Object ds = cp.getBean("dataSource");
        OracleDataSource dataSource1 = (OracleDataSource) ds;
        System.out.println(dataSource.getClass().getName());
        Connection con1 = dataSource1.getConnection();
        System.out.println(con1.getClass().getName());
        Statement stmt1 = con1.createStatement();
        ResultSet rs1 = stmt1.executeQuery("select * from 用户表");
        while(rs1.next()) {
            System.out.println("姓名:"+rs1.getObject("NAME")+","+"地址:"+rs1.getObject("AddRESS"));
        }
        con1.close();
        stmt1.close();
        rs1.close();
    }
}
