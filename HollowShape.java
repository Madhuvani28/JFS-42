package com.PatternExamples;

public class HollowShape {

	public static void main(String[] args) {
		 int n = 7; // height (you can change size here)

	        // Upper half including middle
	        for (int i = 0; i < n; i++) {
	            // spaces before stars
	            for (int j = 0; j < n - i - 1; j++) { // FIX: -1 here
	                System.out.print(" ");
	            }
	            // print hollow stars
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	        // Lower half
	        for (int i = n - 2; i >= 0; i--) {
	            // spaces before stars
	            for (int j = 0; j < n - i - 1; j++) { // FIX: -1 here too
	                System.out.print(" ");
	            }
	            // print hollow stars
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	}

}
