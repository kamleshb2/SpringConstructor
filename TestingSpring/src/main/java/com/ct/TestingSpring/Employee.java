package com.ct.TestingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Employee {
	
	String name;
	String des;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", des=" + des + "]";
	}
	
	public Employee(String name, String des) {
		this.name = name;
		this.des = des;
	}
	public Employee() {
		
	}
	
	
}