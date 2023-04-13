package com.mark.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private Dog dog;
    private List<Integer> phones;
    private List<String> lisLOVE;
    private List<Dog> lisDOG;
    private Set<String> setSTR;
    private Map<String,Dog> dic;

    //初始化对象
    public  void  init()
    {
        System.out.println("初始化用户类对象！");
    }

    //销毁对象前
    public  void  close()
    {
        System.out.println("对象销毁之前调用，用于释放资源（例如：连接池对象等）");
    }
}
