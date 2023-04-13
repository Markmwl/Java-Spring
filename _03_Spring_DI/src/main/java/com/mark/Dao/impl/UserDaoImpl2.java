package com.mark.Dao.impl;

import com.mark.Dao.UserDao;
import com.mark.domain.User;

public class UserDaoImpl2 implements UserDao {

    public String GetUserNameById(int id)
    {
        return  "张三" + id;
    }

    public User GetUserByID(int id)
    {
        return new User(id,"李四",25);
    }
}
