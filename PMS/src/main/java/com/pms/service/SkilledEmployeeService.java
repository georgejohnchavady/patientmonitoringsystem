package com.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.adapter.SkilledEmployeeAdapter;
import com.pms.entity.SkilledEmployeeEntity;
import com.pms.model.SkilledEmployee;
import com.pms.repository.SkilledEmployeeRepository;

@Service
public class SkilledEmployeeService {
	@Autowired
	private SkilledEmployeeAdapter skilledEmployeeAdapter;
	@Autowired
	private SkilledEmployeeRepository skilledEmployeeRepository;

	public SkilledEmployee addSkilledEmployee(SkilledEmployee skilledEmployee, Integer userId) {
		SkilledEmployeeEntity skilledEmployeeentity=skilledEmployeeAdapter.convertToSkilledEmployeeEntity(skilledEmployee,userId);
		SkilledEmployeeEntity skilledEmployeeEntityInDB=skilledEmployeeRepository.save(skilledEmployeeentity);
		SkilledEmployee skilledEmployeeToBeReturned=	skilledEmployeeAdapter.convertSkilledEmployeeEntityToSkilledEmployee(skilledEmployeeEntityInDB);
		return skilledEmployeeToBeReturned;
	}

}
