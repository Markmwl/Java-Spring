package com.mark.Models;


import lombok.*;

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
}
