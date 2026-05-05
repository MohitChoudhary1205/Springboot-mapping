package com.mappingtest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappingtest.Repository.EmployeeRepository;
import com.mappingtest.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public Employee add(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getById(Long eid)   {
		Employee emp = employeeRepository.findById(eid).orElseThrow(()-> new RuntimeException("Employee is not present"));
	return emp;
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

}
