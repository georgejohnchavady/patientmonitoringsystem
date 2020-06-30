package com.pms.adapter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.pms.controller.model.CommiteeMember;
import com.pms.entity.CommiteeMemberEntity;

@Component
public class CommiteeMemberAdapter {

	public CommiteeMemberEntity convertcommiteeMemberTocommiteeMemberEntity(CommiteeMember commiteeMember,
			Integer adminId) {
		
		CommiteeMemberEntity commiteeMemberEntity=new CommiteeMemberEntity();
		commiteeMemberEntity.setCommiteeMember_name(commiteeMember.getCommiteeMember_name());
		commiteeMemberEntity.setPhoneNumber(commiteeMember.getPhoneNumber());
		commiteeMemberEntity.setWardNumber(commiteeMember.getWardNumber());
		commiteeMemberEntity.setCreatedDate(LocalDate.now());
		commiteeMemberEntity.setCreatedBy(adminId);
		
		return commiteeMemberEntity;
	}

	public CommiteeMember convertCommiteeMemberEntityToCommiteeMember(
			CommiteeMemberEntity commiteeMemberEntityStoredInDB) {
		CommiteeMember commiteeMember=new CommiteeMember();
		commiteeMember.setCommiteeMember_id(commiteeMemberEntityStoredInDB.getCommiteeMember_id());
		commiteeMember.setCommiteeMember_name(commiteeMemberEntityStoredInDB.getCommiteeMember_name());
		return commiteeMember;
	}

}
