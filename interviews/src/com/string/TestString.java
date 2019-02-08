package com.string;

public class TestString {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1==s2);
		System.out.println("s1.equls(s2):"+s1.equals(s2));
		
		System.out.println("------------------------------------");
		
		String s3="JournalDev";
		
		int start=1;
		int end=5;
		
		System.out.println(start + end);
		System.out.println(s3.substring(start,end));
		
		System.out.println("---------------------------------------");
		
		String x="abc";
		String y="abc";
		x.concat(y);
		
		System.out.println(x);
		
		
		System.out.println("-----------------------------------------");
		
//		String str=null;
//		String str1="abc";
//		System.out.println(str1.equals("abc") |str.equals(null));
//		
		System.out.println("-------------------------------------------");
		int p=10*10-10;
		System.out.println(p);
	}
}
