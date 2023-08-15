package com.codekul.java10feb.onetomany.controller;


import com.codekul.java10feb.onetomany.domain.State;
import com.codekul.java10feb.onetomany.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StateController {
    @Autowired
    private StateRepo stateRepo;

    @PostMapping("saveState")
    public String saveState(@RequestBody State state){
        stateRepo.save(state);
        return "State Data saved...";
    }
}
