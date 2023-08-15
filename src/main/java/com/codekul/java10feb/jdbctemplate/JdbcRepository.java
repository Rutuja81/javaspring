package com.codekul.java10feb.jdbctemplate;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Repository;

@Repository
public interface JdbcRepository {

    Vehicle getVehicle(Integer id);
}
