package com.mark.services.impl;

import com.mark.Dao.UserDao;
import com.mark.Dao.impl.UserDaoImpl1;
import com.mark.services.UserServices;

public class UserServicesImpl implements UserServices {
    UserDao userDao =new UserDaoImpl1();

    public  void  ShowUser()
    {
        System.out.println(userDao.GetUserNameById(1));
    }

    public  void  ShowUser2(int a)
    {
        System.out.println(userDao.GetUserByID(2));
    }
}
