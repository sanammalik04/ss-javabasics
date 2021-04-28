/**
 * 
 */
package com.ss.jb.prt2;

import java.util.Arrays;
import java.util.List;

/**
 * @author sanammalik
 *
 */
public class AssignmentsPrt2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		maxNumTwoDArr();

	}
	
	public static void maxNumTwoDArr() {
		int [][] arr= { {5, 10, 15, 50}, {25, 30, 35, 40} };
		
		int max = arr[0][0];
		int x = 0;
		int y = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
					x = i;
					y = j;	
				}
				
			}
//			
		}
		System.out.println("The max value is: " + Integer.toString(max) + ", and the coordinates of the max value are: (" + Integer.toString(x) + ", " + Integer.toString(y) + ").");
		
	}

}
