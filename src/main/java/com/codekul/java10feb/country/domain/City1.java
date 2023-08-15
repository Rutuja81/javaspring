package com.codekul.java10feb.country.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class City1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String name;

    private Long pincode;

    @ManyToOne
    @JoinColumn(name = "tehsil_id")
    @JsonBackReference
    private Tehsil1 tehsil1;


}
