package com.codekul.java10feb.apo;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public int studyMaths(int i){
        System.out.println("Boy is studying...");
        return 100;
    }

    public Exception myException() throws Exception{
        throw new Exception("Throwing Exception");
    }
}
