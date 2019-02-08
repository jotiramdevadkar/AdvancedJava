package com.interviews.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		prime();
	}

	private static void prime() {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i ;j++)
			{
				if(i % j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("is prime Number :"+i);
			}
		}
		
	}
}
