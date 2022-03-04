package com.subhajit.SpringBootAnno.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestComp {
	
	static{
		{
			System.out.println("TestComp loaded...");
		}
	}

	{
		System.out.println("TestComp instance created...");
	}
	
	private String name;

	public void testM() {
		System.out.println("test");
	}
	
	@Bean
	public Employee employee() {
		System.out.println("Emp created in TestComp");
		Employee emp = new Employee();
		emp.setName("B");
		return emp;
	}
	
}
