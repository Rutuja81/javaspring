package com.codekul.java10feb.di;


import org.springframework.stereotype.Component;

@Component
public class Employee {
    int id;
    String name;

    Employee(){
        System.out.println("In Employee const...");
    }

    public void show(){
        System.out.println("In show...");
    }
}
