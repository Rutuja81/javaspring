package com.codekul.java10feb.manytomany.controller;

import com.codekul.java10feb.manytomany.domain.Department;
import com.codekul.java10feb.manytomany.domain.Employee1;
import com.codekul.java10feb.manytomany.repository.DepRepo;
import com.codekul.java10feb.manytomany.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    private DepRepo depRepo;

    @Autowired
    private EmpRepo empRepo;

    @PostMapping("saveDep")
    public String saveDep(@RequestBody Department department){
        depRepo.save(department);
        return "department saved";
    }

    @PostMapping("saveEmp")
    public Employee1 saveEmp(@RequestBody Employee1 employee1){
        return empRepo.save(employee1);
    }
}
