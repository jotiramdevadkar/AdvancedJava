package com.interviews.practice;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		
		
		return name.compareTo(o.name);
	}
	
	
}
