package com.mark.Dao.DaoImpl;

import com.mark.Dao.IUserDao;
import lombok.Data;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Data
@Repository("userDao")
public class UserDao implements IUserDao {

    @Value("${jdbc.URL}")
    public String url;
    @Value("${jdbc.user}")
    public String user;
    @Value("${jdbc.password}")
    public String password;

    private OracleDataSource dataSource = null;

    public void GetUserData() throws Exception
    {
        if (dataSource == null)
        {
            dataSource = new OracleDataSource();
        }
        dataSource.setURL(url);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        System.out.println(dataSource.getClass().getName());
        Connection con = dataSource.getConnection();
        System.out.println(con.getClass().getName());
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from 用户表");
        while(rs.next()) {
            System.out.println("姓名:"+rs.getObject("NAME")+","+"地址:"+rs.getObject("AddRESS"));
        }
        System.out.println("我是UserDao...");
        con.close();
        stmt.close();
        rs.close();
    }
}
