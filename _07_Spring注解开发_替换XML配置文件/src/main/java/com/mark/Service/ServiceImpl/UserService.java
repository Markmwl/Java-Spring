package com.mark.Service.ServiceImpl;

import com.mark.Service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {

    public  void UserServiceData() throws Exception
    {
        System.out.println("我是UserService...");
    }
}
