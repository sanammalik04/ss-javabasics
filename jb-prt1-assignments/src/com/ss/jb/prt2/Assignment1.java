/**
 * 
 */
package com.ss.jb.prt2;

/**
 * @author sanammalik
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = 0;
		for(int i = 0; i < args.length; i++)
		{
			num = num + Integer.parseInt(args[i]);
		}
		System.out.println("Sum of the values is  " + num);
		

	}
	

}
