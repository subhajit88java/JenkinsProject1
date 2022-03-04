package com.subhajit.SpringBootAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.subhajit.SpringBootAnno.bean.City;
import com.subhajit.SpringBootAnno.bean.Employee;

@SpringBootApplication
public class SpringBootAnnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnoApplication.class, args);
	}

	
	
	
	
}
