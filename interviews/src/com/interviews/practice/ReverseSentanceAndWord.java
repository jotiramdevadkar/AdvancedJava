package com.interviews.practice;

public class ReverseSentanceAndWord {

	public void reverseWordsInMyString(String str)
	{
		
		String[] words=str.split(" ");
		String reversedString ="";
		
		for(int i=0;i < words.length;i++ )
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j >= 0;j--)
			{
				
				reverseWord=reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}
	
	public void reverseSentane(String str)
	{
		
		String[] split=str.split("\\s");
		
		
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		ReverseSentanceAndWord obj=new ReverseSentanceAndWord();
		
	
		//obj.reverseWordsInMyString("This is an easy Java Program");
		//obj.reverseSentane("My Name Is Raju");
		obj.reverseWordsInMyString("My Name Is Raju");
		
	}
}
