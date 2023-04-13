package com.mark.Dao;

import com.mark.domain.User;

public interface UserDao {

    public String GetUserNameById(int id);

    public User GetUserByID(int id);
}
