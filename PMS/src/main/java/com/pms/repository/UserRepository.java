package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.UserEntity;
@Repository
public interface UserRepository extends  JpaRepository<UserEntity, Integer> {
	public UserEntity findByUserNameAndPassword(String username, String password);
}
