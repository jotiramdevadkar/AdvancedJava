package com.collections;

import java.util.HashSet;

public class TestCollections {

	public static void main(String[] args) {
		HashSet sortSet=new HashSet<>();
		for(int i=0;i<100;i++)
		{
			sortSet.add(i);
			sortSet.remove(i-1);
		}
		System.out.println(sortSet.size());
	}
}
