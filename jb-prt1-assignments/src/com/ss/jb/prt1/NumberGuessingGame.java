/**
 * 
 */
package com.ss.jb.prt1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author sanammalik
 *
 */

//User is asked to guess a number 1-100. (Program chooses randomly.)
//If the guess is within 10 of the correct answer, plus or minus, output the correct answer and exit. 
//(If the answer is 63, user must guess 53-73.)
//If the number is not within 10 of the correct answer, ask the user to keep guessing.
//If the user does not succeed within 5 attempts, display, "Sorry," along with the answer and exit.
public class NumberGuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		guessNumberGame();

	}
	
	public static void guessNumberGame() {
		System.out.println("Welcome to the number guessing game!");
		System.out.println();
		
		//get a random number between 1 and 100
		Random rand = new Random();
		int randomNumber = rand.nextInt(99) + 1;
		
		//user input- use scanner to read user input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Pick a number between 1 and 100! You have 5 guesses so pick wisely! :");
		int userGuess;
		int attempts = 1; 
		boolean win = false;
		
		while (win == false)
		{
			userGuess = userInput.nextInt(); //getting the user input to see if it matches the random number
			
			if(attempts < 5)
			{
				
				if(userGuess == randomNumber)
				{
					System.out.println();
					System.out.println("That's correct! The number is: " + randomNumber);
					userInput.close();
					win = true;
					
					
				}
				else if (userGuess == randomNumber +- 10) 
				{
					System.out.println("The correct number is: " + randomNumber);
					System.out.println();
					userInput.close();
					
				}
				else if(userGuess != randomNumber +- 10)
				{
					System.out.println("Keep guessing!");
					System.out.println();
				}
			}
			else if(attempts == 5)
			{
				if(userGuess == randomNumber)
				{
					System.out.println();
					System.out.println("That's correct! The number is: " + randomNumber);
					userInput.close();
					win = true;
					
				}
				if(userGuess != randomNumber)
				{
					
					System.out.println("Sorry! The correct number is: " + randomNumber);
					userInput.close();
				}
			}
			
			attempts = attempts + 1; //incrementing the guesses
		}
		
		
	}

}
