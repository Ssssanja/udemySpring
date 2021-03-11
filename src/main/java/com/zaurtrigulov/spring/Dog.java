package com.zaurtrigulov.spring;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component

public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean is Created");
    }

    @Override
    public void say(){
        System.out.println("Bow-wow!");
    }
    @PostConstruct
    public void init(){
        System.out.println("Class Dog: init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
