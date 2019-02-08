package com.interviews.practice;

abstract class Test{
	void Display()
	{
		System.out.println("Hi");
	}
	
	abstract void print();
}



public class DemoAbstract extends Test{
	
	public static void main(String[] args) {
		
		DemoAbstract d=new DemoAbstract();
		d.Display();
		d.print();
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
	

}
