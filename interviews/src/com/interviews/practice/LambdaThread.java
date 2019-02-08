package com.interviews.practice;

public class LambdaThread {

	public static void main(String[] args) {
		
	//Thread Exmaple without lambda
	Runnable r1= new Runnable() {
	
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("thread1 is running...");
		}
	};
	Thread t1=new Thread(r1);
	t1.start();

	//Thread Example with lambda
	Runnable r2=()->{
		System.out.println("thread2 is Running..");
	};
	Thread t2 =new Thread(r2);
	t2.start();
	}
}
