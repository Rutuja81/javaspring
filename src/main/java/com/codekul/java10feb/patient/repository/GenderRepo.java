package com.codekul.java10feb.patient.repository;

import com.codekul.java10feb.patient.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
}
