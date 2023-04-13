package com.mark.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("dog2")
public class Dog2 implements IDog {

    @Value("琪琪")
    public String Name;

    @Value("3")
    public  Integer Age;

    public void Call()
    {

    }
}
