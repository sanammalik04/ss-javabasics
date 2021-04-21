package com.ss.jb.prt1;
/**
 * 
 */

/**
 * @author sanammalik
 *
 */
//First problem from the first assignment.

public class Problem1{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		patternPrint(4);
	}
	
	public static void patternPrint(int steps) {
		for (int row = 0; row < steps; row++) {
			String stair = "";
			for(int column = 0; column < steps; column++) {
				if(column <= row) {
					stair += "*";
				} else {
					stair += " ";
				}
			}
			System.out.println(stair);
		}
		System.out.println("- - - - - - - - - -");
		
	}

}

		
