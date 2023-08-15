package com.codekul.java10feb.onetomany.repository;

import com.codekul.java10feb.onetomany.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,Integer> {
}
