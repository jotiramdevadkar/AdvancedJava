package com.interviews.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Ram", 25));
		list.add(new Employee(2, "Prasad", 34));
		list.add(new Employee(3, "Amar", 23));
		list.add(new Employee(4, "Vikram", 29));
		
		
		Collections.sort(list);
		
		list.forEach((n)->
		System.out.println(n.id+" "+n.name+" "+n.age));
	}
}
