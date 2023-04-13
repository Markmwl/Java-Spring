package com.mark.domain;

public class User {
    public int ID;

    public String NAME;

    public int AGE;

    public  User(int id,String Name,int Age)
    {
        this.ID = id;
        this.NAME =Name;
        this.AGE = Age;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                '}';
    }
}
