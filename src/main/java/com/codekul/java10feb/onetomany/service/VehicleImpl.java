package com.codekul.java10feb.onetomany.service;

import com.codekul.java10feb.onetomany.domain.Vehicle;
import com.codekul.java10feb.onetomany.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VehicleImpl implements VehicleService {
    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public String saveVehicle(Vehicle vehicle) {
        if (vehicle.getName().equals("TVS")) {
            return "tVS not allowed";
        } else {
            vehicleRepo.save(vehicle);
            return "Vehicle saved";
        }
    }
}
