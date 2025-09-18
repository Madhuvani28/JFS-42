package com.oopexamples;

public class TrianglePerimeter {
	public static double trianglePerimeter(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		double result=trianglePerimeter(3,4,5);
		System.out.println("Perimeter of triangle with sides 3,4,5="+result);
				
	}

}
