package com.codekul.java10feb.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);
    Student findByAddress(String address);
    Student findByNameAndAddress(String name,String address);
    Student findByNameOrAddress(String name,String address);
    Student findDistinctByName(String name);
    List<Student> findByBirthDateBetween(LocalDate firstDate, LocalDate lastName);
}
