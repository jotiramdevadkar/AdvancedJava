package com.generic;

public class TestMyGen {

	public static void main(String[] args) {
		
		MyGen<Integer> m=new MyGen<>();
		m.add(2);
		//m.add("ram");
		System.out.println(m.get());
	}
}
