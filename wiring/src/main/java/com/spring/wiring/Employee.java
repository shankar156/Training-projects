package com.spring.wiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired
	private Address address;

	
	public void display() {
		System.out.println(address);
	}

}

