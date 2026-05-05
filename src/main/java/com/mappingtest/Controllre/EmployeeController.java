package com.mappingtest.Controllre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mappingtest.Services.EmployeeServiceImpl;
import com.mappingtest.entities.Employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	 
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
	
		return	employeeServiceImpl.add(emp);
		
	}
	@GetMapping("/get/{eid}")
	public Employee getMethodName(@PathVariable Long eid) {
		return employeeServiceImpl.getById(eid);
	}
	@GetMapping("/all")
	public List<Employee> getMethodName( ) {
		return employeeServiceImpl.getAll();
	}
	
	
	
}
