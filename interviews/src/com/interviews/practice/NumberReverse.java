package com.interviews.practice;

public class NumberReverse {

	public static void main(String[] args) {
		int number=1234;
	
		int a=number/1000;
		System.out.println("A :"+a);
		
		int b=number%1000;
		System.out.println("B :"+b);
		
		int c=b/100;
		System.out.println("C :"+ c);
		
		int d=b%100;
		System.out.println("D :"+d);
		
		int e=d/10;
		System.out.println("E :"+e);
		
		int f=d%10;
		System.out.println("F :"+f);
		
		System.out.println(f+""+e+""+c+""+a);
	}
}
