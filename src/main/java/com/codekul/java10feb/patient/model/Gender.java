package com.codekul.java10feb.patient.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String gender;
}
