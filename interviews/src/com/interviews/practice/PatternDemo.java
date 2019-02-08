package com.interviews.practice;

public class PatternDemo {

	public void Pattern()
	{
		System.out.println("-------------------pattern--------------------");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	public void patternA()
	{
		System.out.println("-------------------patternA--------------------");
		for(int i=0;i <=5;i++)
		{
			for (int j = 0; j <=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	
	public void patternB()
	{
		System.out.println("--------------------patternB-------------------");
		char alphabet='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j <=i;j++)
			{
				System.out.print(alphabet+ " ");
			}
			alphabet++;
			System.out.println();
		}
	}
	
	public void patternC()
	{
		System.out.println("------------patternC----------------");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void patternD()
	{
		System.out.println("----------patternD---------------");
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+ " ");
				k++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		PatternDemo pd=new PatternDemo();
		
		pd.Pattern();
		pd.patternA();
		pd.patternB();
		pd.patternC();
		pd.patternD();
	}
}
