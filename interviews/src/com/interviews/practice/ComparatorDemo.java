package com.interviews.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Ram", 7));
		list.add(new Employee(2, "Prasad", 25));
		list.add(new Employee(3, "Amar", 34));
		list.add(new Employee(4, "Bappu", 30));
		
		System.out.println("Sorting By Name");
		
		Collections.sort(list, new NameComparator());
		
		list.forEach((n)->
		System.out.println(n.id+" "+n.name+" "+n.age));
		
		System.out.println("Sortin by Age");
		Collections.sort(list, new AgeComparator());
		
		list.forEach((n)->{
			System.out.println(n.id+" "+n.name+" "+n.age);
		});
	}
}
