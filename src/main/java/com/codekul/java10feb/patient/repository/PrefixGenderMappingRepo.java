package com.codekul.java10feb.patient.repository;

import com.codekul.java10feb.patient.model.PrefixGenderMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixGenderMappingRepo extends JpaRepository<PrefixGenderMapping,Integer> {
}
