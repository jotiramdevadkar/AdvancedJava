package com.patterns;

import java.util.Scanner;

public class PyramidPattern {

	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the rows to print");
		int rows=scanner.nextInt();
		
		scanner.close();
		
		System.out.println("Printing Pattern 1\n");
		printPattern1(rows);
		
	}
	
	//utility function to print String given times
	private static void printString(String s,int times)
	{
		for(int j=0;j < times ;j++)
		{
			System.out.print(s);
		}
	}
	
	private static void printPattern1(int rows)
	{
		for(int i=0;i <=rows;i++ )
		{
//			white spaces in the front of the numbers 
			int numberOfWhiteSpaces=rows - i;
//			
			printString(" ",numberOfWhiteSpaces);
			
			
		}
	}
}
