package com.interviews.practice;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		
		int n, temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of elements yoeu want in array:");
		n=sc.nextInt();
	
		if(n>1)
		{
			int[] a=new int[n];
			System.out.println("Enter All the Elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int p=0;p < n;p++)
			{
				for(int j=p+1;j< n;j++)
				{
					if(a[p] < a[j])
					{
						temp=a[p];
						a[p]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Largest Two Number Are:"+a[0]+" and "+a[1]);
		}
		else
		{
			System.out.println("Enter Number Greater than 1");
		}
	}

}
