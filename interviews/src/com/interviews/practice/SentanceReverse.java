package com.interviews.practice;

public class SentanceReverse {
	
	
	public void sentenceReverseWords(String str) {
		System.out.println("Sentence is:"+str);
		
		String[] words=str.split(" ");
		String reverseString="";
	
		for(int i=0;i < words.length;i++)
		{	
			String word=words[i];
//			System.out.println(word);
			String reverseword="";
			for(int j=word.length()-1;j >= 0;j--)
			{
				reverseword=reverseword + word.charAt(j);
			}
			reverseString=reverseString + reverseword +" ";
		}
		System.out.println("S. Word Reverse :"+reverseString);
	}
	
	
	public void reverseSentance(String str) {
		String[] sentance=str.split(" ");
		String reverseSentance="";
		for(int i=sentance.length-1; i >=0 ; i--)
		{
			reverseSentance = reverseSentance + sentance[i]+" ";
		}
		System.out.println("Sentance Reverse:"+reverseSentance);
	}
	
	public void reverseSentanceReverseWords(String str)
	{
		String[] sentance=str.split(" ");
		String reverseSentance="";
		for(int i=sentance.length-1;i >=0;i--) {
			
			String word=sentance[i];
			String reverseWord="";
			for(int j=word.length()-1;j >= 0;j--) {
				reverseWord=reverseWord + word.charAt(j);
			}
			
			reverseSentance=reverseSentance + reverseWord +" ";
		}
		
		System.out.println("Reverse Sentance:"+reverseSentance);
	}
	
	public static void main(String[] args) {
		SentanceReverse sr=new SentanceReverse();
		String str="Hi I am Ram";
		
		sr.sentenceReverseWords(str);
		sr.reverseSentance(str);
		sr.reverseSentanceReverseWords(str);
		
	}

}
