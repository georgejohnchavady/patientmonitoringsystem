package com.pms.adapter;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.pms.entity.SkilledEmployeeEntity;
import com.pms.model.SkilledEmployee;
@Component
public class SkilledEmployeeAdapter {

	public SkilledEmployeeEntity convertToSkilledEmployeeEntity(SkilledEmployee skilledEmployee, Integer userId) {
		SkilledEmployeeEntity skilledEmployeeEntity=new SkilledEmployeeEntity();
		skilledEmployeeEntity.setCreatedDate(LocalDate.now());
		skilledEmployeeEntity.setCreatedBy(userId);
		skilledEmployeeEntity.setDesignation(skilledEmployee.getDesignation());
		skilledEmployeeEntity.setPhoneNumber(skilledEmployee.getPhoneNumber());
		skilledEmployeeEntity.setAvailableDays(skilledEmployee.getAvailableDays());
		skilledEmployeeEntity.setSkilledstaffName(skilledEmployee.getSkilledstaffName());
		return skilledEmployeeEntity;
	}

	public SkilledEmployee convertSkilledEmployeeEntityToSkilledEmployee(
			SkilledEmployeeEntity skilledEmployeeEntityInDB) {
		SkilledEmployee employee=new SkilledEmployee();
		employee.setSkilledStaffID(skilledEmployeeEntityInDB.getSkilledstaffId());
		employee.setSkilledstaffName(skilledEmployeeEntityInDB.getSkilledstaffName());
		return employee;
	}

}
