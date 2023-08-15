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
public class Tehsil1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "district_id")
    @JsonBackReference
    private District1 district1;

    @OneToMany(mappedBy = "tehsil1", cascade = {CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<City1> city1List;
}
