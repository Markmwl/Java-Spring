package com.mark.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("user")
public class User {

    @Value("777")
    private int id;

    @Value("马文磊")
    private String name;

    @Value("#{20+5}")
    private int age;

    @Autowired
    @Qualifier("dog2")
    private IDog dog;

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
