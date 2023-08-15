package com.codekul.java10feb.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate,Integer> {
}
