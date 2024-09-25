package com.tcg.education.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tcg.education.response_entity.ResponseQualification;
import com.tcg.education.service.QualificationService;

@RestController
public class QualificationController {
	
	@Autowired
	private QualificationService qualificationService;

	@GetMapping(path = "qualification/{id}")
	public ResponseEntity<ResponseQualification> getQualicationInfoById(@PathVariable(name = "id") long id){
		ResponseQualification qualificationById = qualificationService.getQualificationById(id);
		return ResponseEntity.status(HttpStatus.OK).body(qualificationById);
	}
}
