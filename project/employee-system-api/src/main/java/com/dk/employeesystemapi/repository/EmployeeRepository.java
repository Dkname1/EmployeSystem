package com.dk.employeesystemapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dk.employeesystemapi.entity.EmployeeEntity;



@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
