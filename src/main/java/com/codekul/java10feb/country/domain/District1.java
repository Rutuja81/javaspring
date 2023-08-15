package com.codekul.java10feb.country.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class District1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    @JsonBackReference
    private State1 state1;

    @OneToMany(mappedBy = "district1", cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Tehsil1> tehsil1List;
}
