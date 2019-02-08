package com.string;

public class TestBasics {

	public static void main(String[] args) {
		reachFinalBlock(false);
		reachFinalBlock(true);
	}

	private static void reachFinalBlock(boolean b) {
		
		try {
			if(b)
			{
				while(true)
				{
					
				}
			}else {
			}
			System.exit(1);
		}
		finally {
			System.out.println("In finally");
		}
		
	}
}
