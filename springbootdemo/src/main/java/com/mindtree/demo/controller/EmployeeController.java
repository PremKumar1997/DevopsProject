package com.mindtree.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Prem","Kumar","abc@gmail.com"));
		return employeesList;
    }
	@RequestMapping("/id")
    public int getEmployeesID() 
    {
		return 1;
    }
	
	@RequestMapping("/update")
    public List<Employee> getEmployeesUpdate() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"Prem","Kumar","PremKumar@gmail.com"));
		return employeesList;
    }
	@RequestMapping("/delete")
    public String getEmployeesDelete() 
    {
		return "deleted Successfully";
    }
}
