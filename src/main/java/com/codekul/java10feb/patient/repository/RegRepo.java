package com.codekul.java10feb.patient.repository;

import com.codekul.java10feb.patient.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegRepo extends JpaRepository<Registration, Integer> {
}
