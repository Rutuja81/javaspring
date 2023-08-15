package com.codekul.java10feb.jdbctemplate;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleRowMapper implements RowMapper<VehicleDto> {

    @Override
    public VehicleDto mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Vehicle vehicle = new Vehicle();
        VehicleDto vehicle = new VehicleDto();
        vehicle.setId(rs.getInt("id"));
        vehicle.setColor(rs.getString("colour"));
        vehicle.setName(rs.getString("name"));
        vehicle.setNumber(rs.getString("number"));
        vehicle.setPartName(rs.getString("partName"));
        return vehicle;

    }
}
