package com.tcg.education.service_impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcg.education.custome_exception.ResourceNotFoundException;
import com.tcg.education.entity.Qualification;
import com.tcg.education.repository.QualificationRepo;
import com.tcg.education.response_entity.ResponseQualification;
import com.tcg.education.service.QualificationService;

@Service
public class QualificationServiceImpl implements QualificationService {
	
	@Autowired
	private QualificationRepo qualificationRepo;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public ResponseQualification getQualificationById(Long id) {
		Optional<Qualification> optional = qualificationRepo.findById(id);
		if(optional.isPresent()) {
			return modelMapper.map(optional.get(), ResponseQualification.class);
		}
		throw new ResourceNotFoundException("Your provided qualification id : "+ id+ " not founded, check id and try again..");
	}

}
