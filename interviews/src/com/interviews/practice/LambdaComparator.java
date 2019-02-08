package com.interviews.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaComparator {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		//inserting Product
		list.add(new Product(1, "HP", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));
		
		System.out.println("Sorting on the basis of name...");
		
		//implementing lambda
		Collections.sort(list, (p1,p2)->{
			return p1.name.compareTo(p2.name);
			
		});
		
		for(Product p:list)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		
		System.out.println("********************************************");
		
		list.forEach((n)->{
			System.out.println(n.id+" "+n.name+" "+n.price);
		});
	
	}
}