package com.srvcode.springdemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("${doorNum}")
	private String doorNum;
	
	@Value("${streetName}")
	private String streetName;
	
	@Value("${city}")
	private String city;
	
	public Address() {
		System.out.println("Address object is created");
	}

	// setters & getters
	
	public String getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(String doorNum) {
		this.doorNum = doorNum;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
