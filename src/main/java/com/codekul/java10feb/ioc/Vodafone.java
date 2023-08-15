package com.codekul.java10feb.ioc;

import com.codekul.java10feb.ioc.Sim;

public class Vodafone implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling Vodafone...");
    }

    @Override
    public void msg() {
        System.out.println("msg vodafone...");
    }
}
