package com.purbita.JACOCODemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purbita.JACOCODemo.dao.EmployeeDao;
import com.purbita.JACOCODemo.entity.Employee;



@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	public Employee deleteEmployee(Integer employeeId) {
		return employeeDao.deleteEmployee(employeeId);
	}

	public Employee updateEmployee(Integer employeeId, Employee employee) {
		return employeeDao.updateEmployee(employeeId, employee);
	}

}
