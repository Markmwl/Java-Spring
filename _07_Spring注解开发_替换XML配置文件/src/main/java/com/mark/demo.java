package com.mark;

import com.mark.Config.ApplicationConfig;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws Exception {
        //创建注解容器(注意：类.class 为类的字节码文件)
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        User us =(User)app.getBean("user");
//        System.out.println(us);

//        IUserDao usDao =(IUserDao)app.getBean("userDao");
//        usDao.GetUserData();

        //OracleDataSource dataSource =(OracleDataSource)app.getBean("dataSource");
        //根据类型字节码对象获取
        OracleDataSource dataSource =app.getBean(OracleDataSource.class);
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

        app.close();
    }
}
