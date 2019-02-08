package com.interviews.practice;

public class FirstNonRepeatedCharactor {

	public static void main(String[] args) {
		//wrong
		String str="jotiramj";
		int len=str.length();
		int flag=0;
		for(int i=0;i<len-1;i++)
		{
			for(int j=1;j< len-1;j++)
			{
				if(str.charAt(i) != str.charAt(j))
				{
					flag=1;
				}
				else {
					
				}
			}
		}
	}
}
