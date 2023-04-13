package com.mark.services.impl;

import com.mark.Dao.UserDao;
import com.mark.Dao.impl.UserDaoImpl1;
import com.mark.domain.Dog;
import com.mark.services.UserServices;

import java.util.List;

public class UserServicesImpl implements UserServices {

    UserDao userDao =new UserDaoImpl1();
    public int id;
    public String name;
    public Dog dog;
    public List<Integer> Phones;

    public  UserServicesImpl()
    {
        System.out.println("空参构造");
    }

    public  UserServicesImpl(int _id, String _name,Dog _dog,List<Integer> _Phones)
    {
        id = _id;
        name = _name;
        dog = _dog;
        Phones = _Phones;
        System.out.println("有参构造");
    }

    public  void  ShowUser()
    {
        System.out.println(userDao.GetUserNameById(1));
    }

    public  void  ShowUser2(int a)
    {
        System.out.println(userDao.GetUserByID(2));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhones() {
        return Phones;
    }

    public void setPhones(List<Integer> phones) {
        Phones = phones;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
