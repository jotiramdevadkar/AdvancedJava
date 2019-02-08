package com.interviews.practice;

public class RecursionSentanceDemo {

	public static void main(String[] args) {
		
		String str="Hi, I am Ram";
		System.out.println(sentanceReverse(str));
		
	}

	private static String sentanceReverse(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0)
		{
			return str;
		}
		
		
		return sentanceReverse(str.substring(1))+str.charAt(0);
		
		
	}
}
