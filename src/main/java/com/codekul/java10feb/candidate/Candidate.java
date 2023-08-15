package com.codekul.java10feb.candidate;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String name;

    private String address;

    private Double percentage;

    private LocalDate dob;

}

//
//mysql> select * from candidate where dob between '2001-01-01' AND '2003-01-01';
//        +----+------------+------------+---------+------------+
//        | id | address    | dob        | name    | percentage |
//        +----+------------+------------+---------+------------+
//        |  1 | Pune       | 2002-01-04 | Ramesh  |       78.8 |
//        |  2 | Mumbai     | 2002-08-11 | Akash   |      66.46 |
//        |  3 | Aurangabad | 2002-08-11 | Pradeep |      66.46 |
//        +----+------------+------------+---------+------------+
//        3 rows in set (0.01 sec)
//
//        mysql> select * from candidate order by percentage desc limit 2;
//        +----+----------+------------+----------+------------+
//        | id | address  | dob        | name     | percentage |
//        +----+----------+------------+----------+------------+
//        |  4 | Kolhapur | 2004-08-08 | Sameer   |      95.26 |
//        | 11 | Nagpur   | 1994-09-22 | Harshada |      90.96 |
//        +----+----------+------------+----------+------------+
//        2 rows in set (0.01 sec)
//
//        mysql> select * from candidate;
//        +----+------------+------------+----------+------------+
//        | id | address    | dob        | name     | percentage |
//        +----+------------+------------+----------+------------+
//        |  1 | Pune       | 2002-01-04 | Ramesh   |       78.8 |
//        |  2 | Mumbai     | 2002-08-11 | Akash    |      66.46 |
//        |  3 | Aurangabad | 2002-08-11 | Pradeep  |      66.46 |
//        |  4 | Kolhapur   | 2004-08-08 | Sameer   |      95.26 |
//        |  5 | Kolhapur   | 1996-05-10 | Priya    |      90.26 |
//        |  6 | Pune       | 2008-06-05 | Siya     |      59.26 |
//        |  7 | Banglore   | 1997-01-08 | Mansi    |      69.96 |
//        |  8 | Banglore   | 1997-01-08 | Mansi    |      69.96 |
//        |  9 | Kalyan     | 1995-10-10 | Akshada  |      89.96 |
//        | 10 | Nagpur     | 1990-12-10 | Rahul    |      88.96 |
//        | 11 | Nagpur     | 1994-09-22 | Harshada |      90.96 |
//        +----+------------+------------+----------+------------+
//        11 rows in set (0.00 sec)
