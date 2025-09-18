package com.oopexamples;

public class ParallelogramPerimeter {
	public static double parallelogramPerimeter(double base,double side) {
		return 2*(base+side);
	}

	public static void main(String[] args) {
		double result=parallelogramPerimeter(8,5);
		System.out.println("Perimeter of parallelogram with base=8,side=5="+result);
		

	}

}
