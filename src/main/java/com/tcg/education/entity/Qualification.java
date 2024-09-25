package com.tcg.education.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Qualification")
@Entity(name = "Qualification")
public class Qualification {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "QualificationIdGenerator")
	@SequenceGenerator(name = "QualificationIdGenerator", initialValue = 100, allocationSize = 1, sequenceName = "QualificationId_seq")
	@Column(name = "qualificationId", nullable = false)
	private long qualificationId;

	@Column(name = "qualificationName", length = 200, nullable = false)
	private String qualificationName;

	@Column(name = "universityName", length = 200, nullable = false)
	private String universityName;

	@Column(name = "city", length = 300, nullable = false)
	private String city;

	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Qualification(long qualificationId, String qualificationName, String universityName, String city) {
		super();
		this.qualificationId = qualificationId;
		this.qualificationName = qualificationName;
		this.universityName = universityName;
		this.city = city;
	}

	public long getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(long qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getQualificationName() {
		return qualificationName;
	}

	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
