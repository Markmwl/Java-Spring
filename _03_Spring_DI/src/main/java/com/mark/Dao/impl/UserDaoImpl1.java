package com.mark.Dao.impl;

import com.mark.Dao.UserDao;
import com.mark.domain.User;

public class UserDaoImpl1 implements UserDao {
    public String GetUserNameById(int id)
    {
        return  "王五" + id;
    }

    public User GetUserByID(int id)
    {
        return new User(id,"赵六",25);
    }
}
