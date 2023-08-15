package com.codekul.java10feb.patient.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Prefix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prefix;

    @Transient
    private Integer gender;


}
