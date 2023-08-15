package com.codekul.java10feb.onetomany.controller;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import com.codekul.java10feb.onetomany.service.VehicleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    private VehicleImpl vehicleImpl;

    @PostMapping("saveVehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle) {
        return vehicleImpl.saveVehicle(vehicle);

    }
}
