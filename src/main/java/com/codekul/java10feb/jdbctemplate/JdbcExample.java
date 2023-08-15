package com.codekul.java10feb.jdbctemplate;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcExample {
    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @GetMapping("getVehicleById")
//    public Vehicle getVehicle(@RequestParam Integer id) {
//      return jdbcTemplate.queryForObject("select * from vehicle where id = ?", new Object[] { id }, new VehicleRowMapper());
//    }


    @GetMapping("getVehicleById")
    public List<VehicleDto> getVehicle() {
        return jdbcTemplate.query("select v.id, v.name, v.colour, p.number, p.name as partName from vehicle v " +
                "inner join parts p on p.vehicle_id=v.id;", new Object[] { }, new VehicleRowMapper());
    }

}
