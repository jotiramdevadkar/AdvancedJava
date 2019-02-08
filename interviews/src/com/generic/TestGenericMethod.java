package com.generic;

public class TestGenericMethod {
	
	public static void main(String[] args) {
		
		Integer[] intArray= { 10,20,30,40,50};
		Character[] charArray= {'J','A','V','A','P','O','I','N','T'};
		
		System.out.println("Printing Integer Array");
		printArray(intArray);
		
		System.out.println("Pinting Charactor Array ");
		printArray(charArray);
 	}

	private static <Integer> void printArray(Integer[] elements) {
		// TODO Auto-generated method stub
		
		for(Integer element:elements)
		{
			System.out.println(element);
		}
		
	}


}
