package com.interviews.practice;

public class AddFirstAndSecondNumberSumInArray {

	static int[] arr=new int[] {12,34,22,11,77,99,100,1};
	
	public static void main(String[] args) {
		System.out.println("Max pair Sum Is:"+findLargeSumPair());
	}

	private static int findLargeSumPair() {
		// TODO Auto-generated method stub
		
		int first,second;
		if(arr[0] > arr[1])
		{
			first=arr[0];
			second=arr[1];
		}
		else {
			first=arr[1];
			second=arr[0];
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i] > first)
			{
				second=first;
				first=arr[i];
			}else if (arr[i] > second && arr[i] != first) {
				
				second=arr[i];
			} 
		}
		
		return (first + second);
	}
  }
