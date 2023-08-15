package com.codekul.java10feb.apo;


import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

//    @Before("execution(public * study*(..))")
//    public void warmUp(){
//        System.out.println("Warm up..");
//    }

    @Before("pointCut()")
    public void warmUp(){
        System.out.println("Warm up..");
    }

//    @Before("execution(public void study())")
//    public void warmUp(){
//        System.out.println("Warm up..");
//    }

    @After("pointCut()")
    public void revision(){
        System.out.println("Revision..");
    }


    @Pointcut("execution(public * study*(..))")
    public void pointCut(){
    }


    @AfterReturning(pointcut = "pointCut()",returning = "value")
    public void afterRet(int value){
        System.out.println("After returning "+value);
    }


    @AfterThrowing(pointcut = "execution(public * myException(..))",throwing = "value")
    public void afterThrowing(Exception value){
        System.out.println("In aspect "+ value);
    }
}
