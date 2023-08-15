package com.codekul.java10feb.oneToOne.controller;

import com.codekul.java10feb.oneToOne.Aadhar;
import com.codekul.java10feb.oneToOne.Person;
import com.codekul.java10feb.oneToOne.repository.AadharRepository;
import com.codekul.java10feb.oneToOne.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;

    @PostMapping("savePerson")
    public String savePerson() {

        Person person = new Person();
        person.setName("Prakash");
        person.setAddress("Pune");

        Aadhar aadhar = new Aadhar();
        aadhar.setNumber(123456789123L);

        person.setAadhar(aadhar);

        personRepository.save(person);
        aadharRepository.save(aadhar);

        return "person saved...";

    }

}
