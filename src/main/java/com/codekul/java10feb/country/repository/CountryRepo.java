package com.codekul.java10feb.country.repository;

import com.codekul.java10feb.country.domain.Country1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country1,Integer> {
}
