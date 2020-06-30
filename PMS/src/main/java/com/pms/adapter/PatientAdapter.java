package com.pms.adapter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.pms.controller.model.Patient;
import com.pms.entity.PatientEntity;
@Component
public class PatientAdapter {

	public PatientEntity convertPatientToPatientEntity(Patient patient, Integer committeMemberId) {
		PatientEntity entity= new PatientEntity();
		entity.setCreatedBy(committeMemberId);
		entity.setCreatedDate(LocalDate.now());
		entity.setDisease(patient.getDisease());
		entity.setPatientName(patient.getPatientName());
		entity.setPhoneNumber(patient.getPhoneNumber());
		entity.setWardNumber(patient.getWardNumber());
	
		return entity;
	}

	public Patient convertPatientEntityToPatient(PatientEntity patientEntitySavedInDb) {
		Patient patient=new Patient();
		patient.setPatientId(patientEntitySavedInDb.getPatientId());
		patient.setPatientName(patientEntitySavedInDb.getPatientName());
		
		return patient;
	}

}
