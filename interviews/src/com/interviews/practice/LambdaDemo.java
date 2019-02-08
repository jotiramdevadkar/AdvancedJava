package com.interviews.practice;

interface Drawable{
	public void draw();
}
public class LambdaDemo {
	public static void main(String[] args) {
		int width=10;
		
	//without lambda, Drawable implemantation using Anonymous class
		
		Drawable d=new Drawable() {
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing "+width);
			}
		};
		d.draw();
	}
}
