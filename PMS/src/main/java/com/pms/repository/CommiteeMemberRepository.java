package com.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.CommiteeMemberEntity;

@Repository
public interface CommiteeMemberRepository extends JpaRepository<CommiteeMemberEntity, Integer> {

}
