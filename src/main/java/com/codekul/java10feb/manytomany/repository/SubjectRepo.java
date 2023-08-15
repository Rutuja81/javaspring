package com.codekul.java10feb.manytomany.repository;

import com.codekul.java10feb.manytomany.domain.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}
