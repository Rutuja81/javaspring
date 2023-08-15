package com.codekul.java10feb.patient.controller;

import com.codekul.java10feb.patient.model.*;
import com.codekul.java10feb.patient.repository.GenderRepo;
import com.codekul.java10feb.patient.repository.PrefixGenderMappingRepo;
import com.codekul.java10feb.patient.repository.PrefixRepository;
import com.codekul.java10feb.patient.repository.RegRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private RegRepo regRepo;

    @Autowired
    private PrefixRepository prefixRepository;

    @Autowired
    private GenderRepo genderRepo;

    @Autowired
    private PrefixGenderMappingRepo prefixGenderMappingRepo;

    @PostMapping("savePatient")
    public String savePatient(@RequestBody Registration registration) {
        regRepo.save(registration);
        return "Patient saved";
    }


    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender) {
        genderRepo.save(gender);
        return "gender saved";
    }

    @PostMapping("savePrefix")
    public String saveGPrefix(@RequestBody Prefix prefix) {

        Prefix prefix1 = prefixRepository.save(prefix);
        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setPrefixId(prefix1.getId());
        prefixGenderMappingId.setGenderId(prefix1.getGender());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);
        prefixGenderMappingRepo.save(prefixGenderMapping);
        return "prefix saved";
    }


}
