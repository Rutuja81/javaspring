package com.codekul.java10feb.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "Student saved...";

    }

    @GetMapping("getAllStudent")
    public List<Student> getAllRecord(){
        return studentRepository.findAll();
    }


//    @GetMapping("getStudentById/{id}")
//    public Student getStudentById(@PathVariable("id") Integer id){
//        return studentRepository.getById(id);
//    }

    @GetMapping("getStudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Integer id){
        return studentRepository.findById(id);
    }


//    @PutMapping("updateStudent")
//    public Student updateStudent(@RequestBody Student student){
//        return studentRepository.save(student);
//    }

    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student){
        Student student1= studentRepository.getById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());
        student1.setBirthDate(student.getBirthDate());
        return studentRepository.save(student1);
    }

    @DeleteMapping("deleteById/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
        return "Student Deleted";
    }

    @DeleteMapping("deleteByObject")
    public String deleteByObject(@RequestBody Student student){
        studentRepository.delete(student);
        return "Student Deleted";
    }

    @DeleteMapping("deleteAll")
    public String deleteAll(){
        studentRepository.deleteAll();
        return "Student Deleted";
    }

    @DeleteMapping("deleteAllById/{ids}")
    public String deleteAllByIds(@PathVariable("ids") List<Integer> ids){
        studentRepository.deleteAllById(ids);
        return "Student Deleted";
    }

    @GetMapping("findByName/{name}")
    public Student findByName(@PathVariable("name") String name){
        return studentRepository.findByName(name);

    }


    @GetMapping("findByAddress/{address}")
    public Student findByAddress(@PathVariable("address") String address){
        return studentRepository.findByAddress(address);

    }

    @GetMapping("findByNameAndAddress")
    public Student findByAddress(@RequestParam("name") String name, @RequestParam("address") String address){
        return studentRepository.findByNameAndAddress(name, address);

    }


    @GetMapping("findByNameOrAddress")
    public Student findByNameOrAddress(@RequestParam("name") String name, @RequestParam("address") String address){
        return studentRepository.findByNameOrAddress(name, address);

    }


    @GetMapping("findDistinctByName")
    public Student findDistinctByName(@RequestParam("name") String name){
        return studentRepository.findDistinctByName(name);

    }

    @GetMapping("findByDateBetween")
    public List<Student> findByBirthDateBetween(@RequestParam("firstDate") String firstDate,
                                                @RequestParam("secondDate") String secondDate){
        return studentRepository.findByBirthDateBetween(LocalDate.parse(firstDate),LocalDate.parse(secondDate));
    }


}
