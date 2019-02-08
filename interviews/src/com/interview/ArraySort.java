package com.interview;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int[] arr= {2,6,4,8,4,3,5};
		int len=arr.length;
		//sort(arr);
		sort(arr,len);
		print(arr);
	}

    public  static void print(int[] arr)
    {
    	
    	System.out.println("Sorted Array: ");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	
    }
	private static void sort(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		for(int i=0; i < length-1;i++)
		{
			if(arr[i] > arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			sort(arr,length-1);
		}
		
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] < arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
