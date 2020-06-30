package com.pms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.model.SkilledEmployee;
import com.pms.service.SkilledEmployeeService;

@Controller
public class SkilledEmployeeController {
	@Autowired
	private SkilledEmployeeService skilledEmployeeService; 
	@RequestMapping("/addSkilledEmployee")
	public String showSkilleedEmployeeForm() {
		return "skilledEmployee";
	}
	
	@PostMapping("/addSkilledEmployee")
	public ModelAndView addSkilleedEmployeeForm(@ModelAttribute("skilledEmployee")SkilledEmployee skilledEmployee,HttpSession session) {
		SkilledEmployee employee=skilledEmployeeService.addSkilledEmployee(skilledEmployee,(Integer)session.getAttribute("userid"));
		ModelAndView mav=new ModelAndView();
		mav.setViewName("skilledEmployee");
		mav.addObject("skilledEmployeeAddition",employee.getSkilledstaffName() +"Is Added,Kindly note  ID:"+employee.getSkilledStaffID());
		return mav;
	}
	

}
