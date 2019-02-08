package com.interviews.practice;

interface Addable7{
	int add(int a,int b);
}
public class LambdaExample7 {

	public static void main(String[] args) {
		Addable7 ad=(a,b)->(a+b);
		System.out.println(ad.add(10, 20));
		
		//lambda Expression with return keyword
		Addable7 ad1=(a,b)->{
			return (a+b);
		};
		System.out.println(ad1.add(100, 200));
	}
}
