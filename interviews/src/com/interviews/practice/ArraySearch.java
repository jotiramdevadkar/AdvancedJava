package com.interviews.practice;

import java.util.Scanner;

public class ArraySearch {

	
	public void search(int[] number) {
		
		int item,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item");
		item=sc.nextInt();
		
		for(int i=0;i < number.length; i++)
		{
			if(number[i]==item)
			{
				flag=i+1;
			}
			else
			{
				flag=0;
			}
		}
		if(flag != 0)
		{
			System.out.println("Item found at Location : "+ flag);
		}
		else
		{
			System.out.println("item not found");
		}
		
	}
	
	public static void main(String[] args) {
		int[] number= {1,8,4,9,3,6,5,2,7};
		
		ArraySearch obj=new ArraySearch();
		
		obj.search(number);
	}
}
