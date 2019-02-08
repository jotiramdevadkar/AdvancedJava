package com.interviews.practice;

public class Human extends Boy{

	public String eat()
	{
		System.out.println("Human Is eating");
		return "hi";
	}

	public static void main(String[] args) {
		
		System.out.println("Hi Main Method");
		Human h=new Human();
		h.eat();
	}
}

class Boy {
	public String eat()
	{
		System.out.println("Boy is eating.......");
		return "hello";
	}
}