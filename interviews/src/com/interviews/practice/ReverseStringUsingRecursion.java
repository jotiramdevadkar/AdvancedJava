package com.interviews.practice;

public class ReverseStringUsingRecursion {

	public String reverseString(String str) {
		if(str.isEmpty())
		{
			return str;
		}
		else {
			System.out.println(str.substring(1));
			System.out.println(str.charAt(0));
			return reverseString(str.substring(1))+str.charAt(0);
		}
	}
	
	public static void  reverse(String str)
	{
		for(int i=str.length()-1;  i>= 0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		ReverseStringUsingRecursion rr=new ReverseStringUsingRecursion();
		String result=rr.reverseString("Jotiram");
		System.out.println(result);
		reverse("Jotiram");
	}
}
