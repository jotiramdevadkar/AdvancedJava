package com.interviews.practice;

public class ArraySort {

//bubble sort
	public void sortArray(int[] num) {
		for(int i=0;i < num.length; i++)
		{
			for(int j=0; j< num.length;j++)
			{
				if(num[i] < num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Sorting Array list");
		for(int i=0; i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	
	public void reverseArray(int[] number)
	{
		
		System.out.println("Array reverse: ");
		for(int i=number.length-1; i >=0 ;i--)
		{
			System.out.print(number[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] number= {1,4,6,3,7,2,6,3,9,11};
		
		ArraySort as=new ArraySort();
		as.sortArray(number);
		as.reverseArray(number);
	}
}
