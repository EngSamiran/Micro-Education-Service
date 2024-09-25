package com.tcg.education.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcg.education.entity.Qualification;

@Repository
public interface QualificationRepo extends JpaRepository<Qualification, Long> {

}
