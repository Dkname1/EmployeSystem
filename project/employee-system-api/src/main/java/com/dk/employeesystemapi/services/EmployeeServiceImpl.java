package com.dk.employeesystemapi.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.dk.employeesystemapi.entity.EmployeeEntity;
import com.dk.employeesystemapi.model.Employee;
import com.dk.employeesystemapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
		
	
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeeRepository = employeerepository;
	}


	@Override
	public Employee createEmployee(Employee employee) {
		  EmployeeEntity employeeEntity = new EmployeeEntity();
		  
		  BeanUtils.copyProperties(employee, employeeEntity);
		  employeeRepository.save(employeeEntity);
	      	return employee;
	}


	
}
