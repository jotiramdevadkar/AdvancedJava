package com.interviews.practice;
interface Drawable1{
	public void draw();
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		int width=10;
		
		//with lambda
		
		Drawable d=()->{
			System.out.println("Drawing "+width);
		};
		d.draw();
	}
}
