package com.codekul.java10feb.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

    @Autowired
    private CandidateRepo candidateRepo;

    @PostMapping("saveCandidate")
    public String saveCandidate(@RequestBody Candidate candidate){
        candidateRepo.save(candidate);
        return "Candidate Saved";
    }

}
