package com.generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectange");
	}
	
}
class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}
	
}

public class TestGenericWildCard {

	
	public static void drawShapes(List<? extends Shape> list) {
		for(Shape s:list)
		{
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		List<Rectangle> list1=new ArrayList<>();
		list1.add(new Rectangle());
		
		List<Circle> list2=new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		drawShapes(list1);
		drawShapes(list2);
	}
}
