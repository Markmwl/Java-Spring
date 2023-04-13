package com.mark.services.impl;

import com.mark.Dao.UserDao;
import com.mark.Dao.impl.UserDaoImpl2;
import com.mark.services.GroupServices;

public class GroupServicesImpl implements GroupServices {
    UserDao userDao =new UserDaoImpl2();

    public  void  ShowUser()
    {
        System.out.println(userDao.GetUserByID(1));
    }

    public  void  ShowUser2()
    {
        System.out.println(userDao.GetUserByID(2));
    }

}
