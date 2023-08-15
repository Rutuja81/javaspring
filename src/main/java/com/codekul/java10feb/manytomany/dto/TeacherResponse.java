package com.codekul.java10feb.manytomany.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id","name","address"})
public interface TeacherResponse {

    @JsonProperty("Id")
    Integer getId();

    String getName();

    String getAddress();
}
