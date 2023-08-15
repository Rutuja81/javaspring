package com.codekul.java10feb.oneToOne.repository;

import com.codekul.java10feb.oneToOne.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
