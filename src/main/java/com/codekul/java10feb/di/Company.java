package com.codekul.java10feb.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    /**
     * in field based injection Autowired annotation is applied to reference variable.It is also called wiring.
     */

    @Autowired
    private Employee employee;

    //Setter based injection
//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    //Constructor based injection
//    @Autowired
//    public Company(Employee employee){
//        this.employee=employee;
//    }

    public void display(){
        employee.show();
    }
}
