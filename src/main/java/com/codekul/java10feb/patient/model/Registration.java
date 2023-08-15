package com.codekul.java10feb.patient.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String mobileNumber;

    private String firstName;

//    private String middleName;

    private String lastName;

    private String address;

    private String gender;

    private String prefix;

    private LocalDate dob;
//    private LocalDate age;
//    private LocalDate years;
//    private LocalDate months;
//    private LocalDate days;

//    private String bloodgroup;
//    private String maritalstatus;
//    private String firstName;

}
