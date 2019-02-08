package com.interviews.practice;

interface Sayable1{
	public String say(String name);
}
public class LambdaDemo5 {

	public static void main(String[] args) {
		//lanbda Expression with single parameter
		Sayable1 s= (name)->{
			return "Hello, "+name;
		};
		System.out.println(s.say("raju"));
		
		//you can omit function parantheses
		
		Sayable1 s1=name ->{
			return "Hello, "+name;
		};
		System.out.println(s1.say("rani"));
				
	}
}
