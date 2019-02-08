package com.interviews.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String you want to check:");
		a=sc.nextLine();
		int length=a.length();
		for(int i=length-1;i >=0;i--)
		{
			b=b +a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("String is palindrome.");
		}
		else
		{
			System.out.println("String is not palindrome.");
		}
	}
}
