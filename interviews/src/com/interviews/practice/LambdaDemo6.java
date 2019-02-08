package com.interviews.practice;

interface Addable1{
	int add(int a, int b);
}
public class LambdaDemo6 {

	public static void main(String[] args) {
		//multiple parameters in lambda 
		
		Addable1 ad=(a ,b)->(a+b);
		System.out.println(ad.add(10, 20));
		
		Addable1 ad1=(int a,int b)->(a+b);
		System.out.println(ad1.add(100, 200));
	}
}
