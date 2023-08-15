package com.codekul.java10feb.manytomany.controller;

import com.codekul.java10feb.manytomany.domain.Course;
import com.codekul.java10feb.manytomany.domain.Student1;
import com.codekul.java10feb.manytomany.repository.CourseRepo;
import com.codekul.java10feb.manytomany.repository.Student1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1Controller {
    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private Student1Repo student1Repo;


    @PostMapping("saveCourse")
    public String saveCourse(@RequestBody Course course){
        courseRepo.save(course);
        return "Course Saved...";
    }

    @PostMapping("saveStudent1")
    public String saveCourse(@RequestBody Student1 student1){
        student1Repo.save(student1);
        return "Student Saved...";
    }
}
