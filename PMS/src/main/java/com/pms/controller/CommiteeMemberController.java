package com.pms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.controller.model.CommiteeMember;
import com.pms.service.CommiteeMemberService;

@Controller
public class CommiteeMemberController {
	@Autowired
	private CommiteeMemberService commiteeMemberService;
	@GetMapping("/addCommiteeMember")
	public String showLoginPage()
	{
		return "addCommiteeMember";
	}
	
	@PostMapping("/addCommiteeMember")
	public ModelAndView addCommiteeMember(@ModelAttribute("commiteeMember")CommiteeMember commiteeMember,HttpSession session)
	{
		CommiteeMember commiteeMemberToBeReturned= commiteeMemberService.addCommiteeMember(commiteeMember,(Integer)session.getAttribute("userid"));
		ModelAndView mav=new ModelAndView();
		mav.setViewName("addCommiteeMember");
		mav.addObject("commiteeMemberAddition", commiteeMemberToBeReturned.getCommiteeMember_name()+"Is added as CM with id:"+commiteeMemberToBeReturned.getCommiteeMember_id());
		
		return mav;
	}

}
