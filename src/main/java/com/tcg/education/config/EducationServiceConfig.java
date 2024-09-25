package com.tcg.education.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EducationServiceConfig {
	@Bean
	ModelMapper modelMapperBeanCreate() {
		return new ModelMapper();
	}
}
