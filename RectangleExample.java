package com.oopexamples;
public class RectangleExample {
    
    // Method to calculate perimeter of rectangle
    public static double rectangleExample(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        double length = 10;
        double width = 5;

        double result = rectangleExample(length, width);

        System.out.println("Perimeter of rectangle with length " + length + 
                           " and width " + width + " is: " + result);
    }
}
