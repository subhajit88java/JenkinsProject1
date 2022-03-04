package com.subhajit.SpringBootAnno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subhajit.SpringBootAnno.bean.Employee;

@RestController
public class TestController {

	@Autowired
	private Employee emp;
	
	@GetMapping("/test")
	public Employee test() {
		
		System.out.println("in test " + emp);
		System.out.println("In test : " + System.identityHashCode(emp));
		emp.setName("C");
		return emp;
	}
	
	
}
