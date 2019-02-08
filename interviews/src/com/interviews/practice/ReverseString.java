package com.interviews.practice;


public class ReverseString {

	public void reverse()
	{
		String original="jotiram Devadkar";
		String reverse="";
		
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse + original.charAt(i);
		}
		
		System.out.println(reverse);
		
	}
	
	public void reverse1() {
		System.out.println("hhhhhhhhhhh");
		
		String original="Jotiram Devadkar";
		String reverse="";
		String[] words=original.split(" ");
		for(int i=0;i < words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord + word.charAt(j);
			}
			reverse= reverse + reverseWord +" ";
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {

		ReverseString rs=new ReverseString();
		rs.reverse();
		rs.reverse1();
	}
}
