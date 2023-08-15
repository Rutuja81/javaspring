package com.codekul.java10feb.country.controller;

import com.codekul.java10feb.country.domain.*;
import com.codekul.java10feb.country.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Country1Controller {
    @Autowired
    private CountryRepo countryRepo;

    @Autowired
    private State1Repo state1Repo;

    @Autowired
    private District1Repo district1Repo;

    @Autowired
    private Tehsil1Repo tehsil1Repo;

    @Autowired
    private City1Repo city1Repo;


    @PostMapping("saveCity1")
    public String saveCity1(@RequestBody City1 city1){
        city1Repo.save(city1);
        return "City saved...";
    }

    @PostMapping("saveTehsil1")
    public String saveTehsil1(@RequestBody Tehsil1 tehsil1){
        tehsil1Repo.save(tehsil1);
        return "Tehsil saved...";
    }

    @PostMapping("saveDistrict1")
    public String saveDistrict1(@RequestBody District1 district1){
        district1Repo.save(district1);
        return "District saved...";
    }

    @PostMapping("saveState1")
    public String saveState1(@RequestBody State1 state1){
        state1Repo.save(state1);
        return "State saved...";
    }

    @PostMapping("saveCountry1")
    public String saveCountry1(@RequestBody Country1 country1){
        countryRepo.save(country1);
        return "Country saved...";
    }
}


//    select c.name, s.name, d.name, t.name, v.name from country1 c inner join state1 s inner join district1 d inner join tehsil1 t inner join city1 v on s.country_id=c.id AND d.state_id=s.id AND t.district_id=d.id AND v.tehsil_id=t.id;
//        +-------+-------------+-----------------+-----------+----------+
//        | name  | name        | name            | name      | name     |
//        +-------+-------------+-----------------+-----------+----------+
//        | India | Maharashtra | Pune            | Haveli    | Pune     |
//        | India | Gujrat      | Rajkot          | Jetpur    | Jetpur   |
//        | India | Gujrat      | Surat           | Mandvi    | Areth    |
//        | India | Karnataka   | Dakshin Kannada | Mangalore | Manglore |
//        | India | Karnataka   | Bangluru        | Magadi    | Alur     |
//        | India | Karnataka   | Mysore          | Hunsur    | Thippur  |
//        | India | Rajasthan   | Jaisalmer       | Pokhran   | Ajasar   |
//        | India | Rajasthan   | Kota            | Sangod    | Baisar   |
//        +-------+-------------+-----------------+-----------+----------+
//        8 rows in set (0.01 sec)
//
//        mysql>  select c.name, s.name, d.name, t.name, v.name from country1 c inner join state1 s inner join district1 d inner join tehsil1 t inner join city1 v on s.country_id=c.id AND d.state_id=s.id AND t.district_id=d.id AND v.tehsil_id=t.id where v.pincode=411038;
//        +-------+-------------+------+--------+------+
//        | name  | name        | name | name   | name |
//        +-------+-------------+------+--------+------+
//        | India | Maharashtra | Pune | Haveli | Pune |
//        +-------+-------------+------+--------+------+
//        1 row in set (0.00 sec)