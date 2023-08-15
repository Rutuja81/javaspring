package com.codekul.java10feb.manytomany.repository;

import com.codekul.java10feb.manytomany.domain.Employee1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee1,Integer> {
}
