package com.mark.Service.UserService;

import com.mark.Dal.UserDao;
import com.mark.Models.User;
import com.mark.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService implements IUserService {

    @Autowired
    public UserDao userDao;

    public List<User> selectUserAll()
    {
       return userDao.selectUserAll();
    }
}
