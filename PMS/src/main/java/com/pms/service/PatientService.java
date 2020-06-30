package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.adapter.PatientAdapter;
import com.pms.controller.model.Patient;
import com.pms.entity.PatientEntity;
import com.pms.repository.PatientRepository;
@Service
public class PatientService {
@Autowired
private PatientRepository patientRepository;
	@Autowired
	private PatientAdapter patientAdapter;
	public Patient addPatient(Patient patient, Integer committeMemberId) {
		PatientEntity patientEntity=patientAdapter.convertPatientToPatientEntity(patient,committeMemberId);
		PatientEntity patientEntitySavedInDb=patientRepository.save(patientEntity);
		Patient patientToBeReturned=patientAdapter.convertPatientEntityToPatient(patientEntitySavedInDb);
		return patientToBeReturned;
	}

}
 