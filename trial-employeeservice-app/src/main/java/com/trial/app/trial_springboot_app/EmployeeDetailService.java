package com.trial.app.trial_springboot_app;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.trial.app.trial_springboot_app.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeDetailService {
	List<Employee> employeeList = null;
	private final Gson gson = new Gson();
	private final Logger logger = LoggerFactory.getLogger(EmployeeDetailService.class);
	
	@PostConstruct
	private void init() {
		employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee().setEmployeeId(1L).setEmployeeName("A").setEmailId("a@gmail.com"));
		employeeList.add(new Employee().setEmployeeId(2L).setEmployeeName("A").setEmailId("a1@gmail.com"));
		employeeList.add(new Employee().setEmployeeId(3L).setEmployeeName("C").setEmailId("c@gmail.com"));
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces = "application/json")
	public String getEmployeeDetail(@PathVariable("id") long id) {
		logger.info(">>>>>>>>received request for id: {}", id);
		Employee resultEmployee = null;
		
		for(Employee emp : employeeList) {
			if(emp.getEmployeeId() == id) {
				resultEmployee = emp;
			}
		}
		
		if(resultEmployee==null) {
			return "No employee found for given id";
		}
		return gson.toJson(resultEmployee);
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces = "application/json")
	public String getEmployeeDetail(@RequestParam String employeeName) {
		
		List<Employee> resultEmployeeList = new ArrayList<Employee>();
		
		for(Employee emp : employeeList) {
			if(emp.getEmployeeName().equals(employeeName)) {
				resultEmployeeList.add(emp);
			}
		}
		if(resultEmployeeList.isEmpty()) {
			return "No employee found for given id";
		}
		
		return gson.toJson(resultEmployeeList);
		
	}

}
