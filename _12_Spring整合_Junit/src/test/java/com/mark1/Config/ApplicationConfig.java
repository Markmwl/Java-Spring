package com.mark1.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mark")//这里的com.mark指向的是main.java.com.mark，不是test.java.com.mark1
public class ApplicationConfig {
}
