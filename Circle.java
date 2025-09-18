package com.oopexamples;

public class Circle {

	public static double circlePerimeter(double radius) {
		return 2*Math.PI*radius;
		}
	public static void main(String[]args) {
		double result=circlePerimeter(7);
		System.out.println("perimeter of circle with radius 7="+result);
	}

}
