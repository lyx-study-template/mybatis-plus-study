package com.lyx.process.controller;

import com.lyx.entity.Employee;
import com.lyx.process.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController
{
	@Autowired
	@Qualifier("employeeServiceImpl")
	private EmployeeService service;

	@GetMapping("/listAll")
	public List<Employee> listAll()
	{
		return service.list();
	}
}