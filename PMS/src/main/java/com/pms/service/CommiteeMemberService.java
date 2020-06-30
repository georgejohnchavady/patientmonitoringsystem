package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.adapter.CommiteeMemberAdapter;
import com.pms.controller.model.CommiteeMember;
import com.pms.entity.CommiteeMemberEntity;
import com.pms.repository.CommiteeMemberRepository;

@Service
public class CommiteeMemberService {
	@Autowired
	private CommiteeMemberAdapter commiteeMemberAdapter;
	@Autowired
	private CommiteeMemberRepository commiteeMemberRepository;
	

	public CommiteeMember addCommiteeMember(CommiteeMember commiteeMember, Integer adminId) {
		CommiteeMemberEntity commiteeMemberEntity= 	commiteeMemberAdapter.convertcommiteeMemberTocommiteeMemberEntity(commiteeMember,adminId);
		CommiteeMemberEntity commiteeMemberEntityStoredInDB=commiteeMemberRepository.save(commiteeMemberEntity);
		
		CommiteeMember commiteeMemberToBeReturned=commiteeMemberAdapter.convertCommiteeMemberEntityToCommiteeMember(commiteeMemberEntityStoredInDB);
		
		return commiteeMemberToBeReturned;
		
		
	}

}
