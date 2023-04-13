package com.mark.domain;

import java.util.*;

public class User {
    public User() {
    }
    private int ID;
    private String NAME;
    private int AGE;
    private Dog DOG;
    private List<String> lisLOVE;
    private List<Dog> lisDOG;
    private Set<String> setSTR;
    private Map<String,Dog> dic;
    private int[] arr;
    private Properties prop;

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                ", DOG=" + DOG +
                ", lisLOVE=" + lisLOVE +
                ", lisDOG=" + lisDOG +
                ", setSTR=" + setSTR +
                ", dic=" + dic +
                ", arr=" + Arrays.toString(arr) +
                ", prop=" + prop +
                '}';
    }

    public  User(int id,String Name,int Age)
    {
        this.ID = id;
        this.NAME =Name;
        this.AGE = Age;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public Dog getDOG() {
        return DOG;
    }

    public void setDOG(Dog DOG) {
        this.DOG = DOG;
    }

    public List<String> getLisLOVE() {
        return lisLOVE;
    }

    public void setLisLOVE(List<String> lisLOVE) {
        this.lisLOVE = lisLOVE;
    }

    public List<Dog> getLisDOG() {
        return lisDOG;
    }

    public void setLisDOG(List<Dog> lisDOG) {
        this.lisDOG = lisDOG;
    }

    public Set<String> getSetSTR() {
        return setSTR;
    }

    public void setSetSTR(Set<String> setSTR) {
        this.setSTR = setSTR;
    }

    public Map<String, Dog> getDic() {
        return dic;
    }

    public void setDic(Map<String, Dog> dic) {
        this.dic = dic;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
