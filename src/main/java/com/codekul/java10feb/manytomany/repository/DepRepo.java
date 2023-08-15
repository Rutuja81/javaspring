package com.codekul.java10feb.manytomany.repository;

import com.codekul.java10feb.manytomany.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepRepo extends JpaRepository<Department,Integer> {
}
