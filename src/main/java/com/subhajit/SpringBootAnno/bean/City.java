package com.subhajit.SpringBootAnno.bean;

import org.springframework.stereotype.Component;

@Component
public class City {

	private String city;
	
	public City() {}

	public City(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "City [city=" + city + "]";
	}
	
	
}
