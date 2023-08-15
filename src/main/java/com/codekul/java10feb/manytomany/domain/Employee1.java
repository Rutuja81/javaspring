package com.codekul.java10feb.manytomany.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Emp_Dep",joinColumns = {@JoinColumn(name = "Emp_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "Dep_id",referencedColumnName = "name")})
    private List<Department> department;


}
