package com.pms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.controller.model.Patient;
import com.pms.service.PatientService;

@Controller
public class PatientController {
	@Autowired
	private PatientService patientService; 
	@GetMapping("/addPatient")
	public String showAddPatientForm() {
		return "addPatient";
	}
	
	@PostMapping("/addPatient")
	public ModelAndView AddPatientForm(@ModelAttribute("patient")Patient patient,HttpSession session) {
		Patient patientFromDB=patientService.addPatient(patient,(Integer)session.getAttribute("userid"));
		ModelAndView mav=new ModelAndView();
		mav.setViewName("addPatient");
		mav.addObject("patientAddition", patientFromDB.getPatientName()+"Is Added with Id:"+patientFromDB.getPatientId());
		return mav;
	}


}
