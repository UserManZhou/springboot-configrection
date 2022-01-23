package com.spring.boot.service;

import com.spring.boot.porperties.HelloPorperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    private HelloPorperties helloPorperties;

    public String sayHello(){
        return "CUSTOM"+helloPorperties.getName()+"CUSTOM"+helloPorperties.getAge();
    }

}
