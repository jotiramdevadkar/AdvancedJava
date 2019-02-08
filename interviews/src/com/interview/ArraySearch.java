package com.interview;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr= {3,6,4,8,2,9,1};
		int num=3;
		search(arr,num);
		int index=search(arr,0,arr.length,num);
		if(index != -1)
		{
			System.out.println(num +" Present at Location :"+(index+1));
		}
		else {
			System.out.println(num + " is Not present");
		}
	}

	

	private static int search(int[] arr, int i, int length, int num) {
		// TODO Auto-generated method stub
		
		if( length < i)
		{
			return -1;
		}
		if(arr[i] ==num)
		{
			return i;
		}
		if(arr[length] == num)
		{
			return length;
		}
		return search(arr,i+1,length-1,num);
		
		
	}



	private static void search(int[] arr, int num) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] ==num)
			{
				System.out.println("NUmber Found At Location "+(i+1));
				break;
			}
			else {
				System.out.println("Number not Found");
			}
		}
		
		
	}

	
}
