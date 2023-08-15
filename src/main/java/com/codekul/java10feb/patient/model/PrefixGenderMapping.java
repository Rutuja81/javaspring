package com.codekul.java10feb.patient.model;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
@Data
public class PrefixGenderMapping implements Serializable {

    @EmbeddedId
    private PrefixGenderMappingId prefixGenderMappingId;


}
