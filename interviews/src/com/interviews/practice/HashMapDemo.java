package com.interviews.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<>();
		System.out.println("Initial list of element:"+hm);
		hm.put(100, "Amit");
		hm.put(101, "vijay");
		hm.put(102, "Rahul");
		
		System.out.println("After invoking Put() method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking putIfAbsent() method");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(104, "Ravi");
		map.putAll(hm);
		System.out.println("After Invoking putAll() method");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
