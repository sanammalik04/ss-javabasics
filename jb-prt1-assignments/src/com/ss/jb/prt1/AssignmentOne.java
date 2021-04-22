package com.ss.jb.prt1;
/**
 * 
 */

/**
 * @author sanammalik
 *
 */
//First problem from the first assignment.

public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		patternPrintOne();
		patternPrintTwo();
		patternPrintThree();
		patternPrintFour();
	}

	public static void patternPrintOne() {
		for (int row = 1; row <= 4; row++) {
			for (int column = 1; column <= row; column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - - -");
	}

	public static void patternPrintTwo() {
		System.out.println("- - - - - - - - - -");
		for (int row = 1; row <= 4; row++) {
			for (int column = 4; column >= row; column--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void patternPrintThree() {
		for (int row = 1; row <= 4; row++) {
			for (int blanks = 4; blanks >= row; blanks--) {
				System.out.print(" ");
			}
			for (int column = 1; column < (row * 2); column++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("- - - - - - - - - - -");
	}

	public static void patternPrintFour() {
		System.out.println("- - - - - - - - - - - -");
		for (int row = 1; row <= 4; row++) {
			for (int blanks = 1; blanks <= row; blanks++) {
				System.out.print(" ");
			}
			for (int columnOne = 4; columnOne >= row; columnOne--) {
				System.out.print("*");
			}
			for (int columnTwo = 3; columnTwo >= row; columnTwo--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
