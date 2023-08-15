package com.codekul.java10feb.manytomany.repository;

import com.codekul.java10feb.manytomany.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
