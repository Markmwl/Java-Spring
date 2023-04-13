package com.mark.Models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("dog1")
public class Dog implements IDog {

    @Value("旺财")
    public String Name;

    @Value("2")
    public Integer Age;

    public void Call() {

    }
}
