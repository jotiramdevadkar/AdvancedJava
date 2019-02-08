package com.interviews.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee1Test {

	public static void main(String[] args) {
		List<Employee1> list=new ArrayList<>();
		
		Employee1 employee3 =new Employee1(4l, "Puja", 9800.0);
		Employee1 employee=new Employee1(1l, "ram", 12000.0);
		Employee1 employee2 =new Employee1(3l, "Amar", 7400.0);
		Employee1 employee1=new Employee1(2l, "Prasad", 2400.0);
		
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.forEach((n)->System.out.println(n.id+""+n.name+""+n.salary));
		Comparator<Employee1> com=new Comparator<Employee1>() {
			
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		System.out.println("-------------sorting by Name----------");
		Collections.sort(list, com);
		list.forEach((n)->System.out.println(n.id+" "+n.name+" "+n.salary));
		
		Comparator<Employee1> com1=new Comparator<Employee1>() {
			
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				// TODO Auto-generated method stub
				
				if(o1.id==o2.id) {
					return 0;
				}
				else if (o1.id > o2.id) {
					return 1;
				} else {
					
					return -1;
				}
			}
		};
		
		System.out.println("-------sorting by id-----------------");
		Collections.sort(list, com1);
		list.forEach((n)->System.out.println(n.id+" "+n.name+" "+n.salary));
		
		
		Comparator<Employee1> com2=new Comparator<Employee1>() {
			
			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				// TODO Auto-generated method stub
				
				if(o1.salary==o2.salary) {
					return 0;
					
				}else if (o1.salary > o2.salary) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		System.out.println("Sorting by Salary");
		Collections.sort(list, com2);
		list.forEach((n)->System.out.println(n.id+" "+n.name+" "+n.salary));
		
		
	}
	
	
}
