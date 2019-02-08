package com.interviews.practice;

public class DupliateArray {

	
	
	
	public static void main(String[] args) {
	
		int[] a= {1,3,52,2,7,52,3,9,6,5,2};
		
		DupliateArray d=new DupliateArray();
		d.findDuplicate(a);
		
		
	}

	
	private void findDuplicate(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int count=0;
		for(int i=0;i < a.length;i++)
		{
			for(int j=i+1;j < a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				if(count == 1)
				{
					System.out.println("Duplicate Element"+a[i]);
					count=0;
				}
			}
		}
	}
}
