package com.airport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Airport {
	@Value("324")
	int id;
	@Value("Harish Kumar Yampalaku")
	String name;
	@Value("Mechanical Engineering")
	String department;
	@Value("Rajeev Gandhi Memorial College of Engineering & Technology")
	String college;
	public Airport() {
		System.out.println("Created..!!!");
	}
	public Airport(int id, String name, String department, String college) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", name=" + name + ", department=" + department + ", college=" + college + "]";
	}
	
	
	
}
