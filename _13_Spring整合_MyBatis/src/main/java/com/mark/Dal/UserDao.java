package com.mark.Dal;

import com.mark.Models.User;

import java.util.List;

public interface UserDao {
    List<User> selectUserAll();
}
