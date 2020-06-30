package com.pms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.pms.controller.model.LoginBean;
import com.pms.entity.UserEntity;
import com.pms.model.User;
import com.pms.repository.UserRepository;
import com.pms.service.LoginPageService;

@Controller
public class LoginPageController
{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LoginPageService loginPageService;

	@RequestMapping("/")
	public String showLoginPage()
	{
		return "login";
	}
	@RequestMapping("/login")

	public ModelAndView doLogin(@ModelAttribute("loginBean")LoginBean loginBean,HttpSession session) {
		createUser();
		User user=loginPageService.isValidUser(loginBean);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(user.getRoleId());
		mav.addObject("userName", user.getUserName());
		mav.addObject("userId", user.getUserId());
		session.setAttribute("userName", user.getUserName());
		session.setAttribute("role", user.getRoleId());
		session.setAttribute("userid", user.getUserId());
		 
		return mav;
	}
	private void createUser() {
	UserEntity userEntity=new UserEntity();
	userEntity.setPassword("admin");
	userEntity.setRoleId("admin");
	userEntity.setUserId(12);
	userEntity.setUserName("admin");
	userRepository.save(userEntity);
		
	}
	
}
