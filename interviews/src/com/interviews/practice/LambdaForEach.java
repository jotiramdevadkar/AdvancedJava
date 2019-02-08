package com.interviews.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("santosh");
		list.add("angha");
		list.add("govinda");
		list.add("prianka");
		list.add("rupesh");
		
		list.forEach(
			(n)->System.out.println(n)
			);
	}
}
