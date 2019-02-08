package com.interviews.practice;

public class CoreView {
	

	public void m1(int i) {
		System.out.println("int");
	}
	
	public void m1(Integer i) {
		System.out.println("Integer");
	}
	
	public void m2(String s) {
		System.out.println("string");
	}
	public void m2(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		
		CoreView cv=new CoreView();
		cv.m1(5);
		cv.m2(null);
		
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
	}

}
