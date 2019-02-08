package com.interviews.practice;

public class IntersectionOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] arr1= {11,22,44,33,77,};
		int[] arr2= {22,77,99,44,55};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0; j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
					
			}
		}
	}

}
