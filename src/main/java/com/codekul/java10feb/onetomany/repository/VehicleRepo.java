package com.codekul.java10feb.onetomany.repository;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,Integer> {

}
