package com.interviews.practice;

@FunctionalInterface
interface Sayable8{
	String say(String message);
	
}
public class Lambda8 {
		
	public static void main(String[] args) {
		
		Sayable8 person=(message)->{
			String str1="I would like to say,";
			String str2 = str1 + message;
			
			return str2;
		};
		System.out.println(person.say("time is Precious."));
	}
}
