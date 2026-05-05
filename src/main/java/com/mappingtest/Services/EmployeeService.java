package com.mappingtest.Services;

import java.util.List;

import com.mappingtest.entities.Employee;

public interface EmployeeService {
Employee add(Employee employee);
Employee getById(Long eid) ;
List<Employee>getAll();
}
