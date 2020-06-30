package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.adapter.UserAdapter;
import com.pms.controller.model.LoginBean;
import com.pms.entity.UserEntity;
import com.pms.model.User;
import com.pms.repository.UserRepository;

@Service
public class LoginPageService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserAdapter userAdapter;

	public User isValidUser(LoginBean loginBean) {
		UserEntity userEntity=userRepository.findByUserNameAndPassword(loginBean.getUsername(), loginBean.getPassword());
		User user=userAdapter.userEntityToUser(userEntity);
		
		return user;
	}

}
