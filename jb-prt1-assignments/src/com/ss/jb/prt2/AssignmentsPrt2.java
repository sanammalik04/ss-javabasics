/**
 * 
 */
package com.ss.jb.prt2;

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
		int [][] arr= { {5, 10, 15, 20}, {25, 30, 35, 40}, {45, 50, 60, 70, 75} };
		
		int max = arr[0][0];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
//			
		}
		System.out.println(max);
		
		
		
		
	}

}
