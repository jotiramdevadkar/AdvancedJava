package com.interview;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr= {4,3,2,1,875,5};
		//reverse(arr);
		reverse(arr,0,arr.length-1);
		print(arr);
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void reverse(int[] arr, int i, int length) {
		// TODO Auto-generated method stub
		if(i >= length)
		{
			return;
		}
		int temp=arr[i];
		arr[i]=arr[length];
		arr[length]=temp;
		reverse(arr, i+1, length-1);
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=arr.length-1;i >=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
