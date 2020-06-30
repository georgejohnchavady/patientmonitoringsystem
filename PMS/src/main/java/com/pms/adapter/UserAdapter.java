package com.pms.adapter;

import org.springframework.stereotype.Component;

import com.pms.entity.UserEntity;
import com.pms.model.User;
@Component
public class UserAdapter {

	public User userEntityToUser(UserEntity userEntity) {
		User user=new User();
		user.setRoleId(userEntity.getRoleId());
		user.setUserName(userEntity.getUserName());
		user.setUserId(userEntity.getUserId());
		return user;
	}

}
