package com.interviews.practice;

public class PrintSubSetOfString {

	public static void main(String[] args) {
		String str="abcd";
		subSting(str,str.length()); 
	}

	private static void subSting(String str, int length) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<=length;j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
		
	}
	
}
