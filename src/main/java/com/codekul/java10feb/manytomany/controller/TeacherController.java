package com.codekul.java10feb.manytomany.controller;

import com.codekul.java10feb.manytomany.domain.Subjects;
import com.codekul.java10feb.manytomany.domain.Teacher;
import com.codekul.java10feb.manytomany.repository.SubjectRepo;
import com.codekul.java10feb.manytomany.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private TeacherRepo teacherRepo;

    @PostMapping("saveTeacher")
    public ResponseEntity<Response> saveTeacher(@RequestBody Teacher teacher) {

        Response response = new Response();

        Teacher teacher1 = teacherRepo.save(teacher);
        response.setMessage("teacher saved");
        response.setResult(teacher1);
        response.setStatusCode(HttpStatus.OK.value());
        return ResponseEntity.ok(response);

    }

    @PostMapping("saveSubject")
    public ResponseEntity<?> saveSubject(@RequestBody Subjects subjects) {
        Subjects subjects1 = subjectRepo.save(subjects);
        return new ResponseEntity<>(subjects1, HttpStatus.OK);

    }

    @GetMapping("getTeacherData")
    public ResponseEntity<?> getTeacherData(){
        return new ResponseEntity<>(teacherRepo, HttpStatus.OK);
    }

}
