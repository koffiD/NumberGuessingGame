package day7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Generating numbers randomly
		Random random = new Random(); // creating a new class random
		int targetNumber = random.nextInt(10)+ 1; // generating random number from 1 to 10
		int attempts = 3;
		boolean guessCorrectly = false;
		
		System.out.println("Guess a number between 1 and 10");
		System.out.println("You have " + attempts + " attemps. Good luck");
		
		for(int i=1; i<=attempts; i++)
		{
			System.out.println("Attempt" + i + " :Enter your guess");
			int userGuess = input.nextInt();
			
			if(userGuess==targetNumber)
			{
				System.out.println("Congrats! You have guessed the correct number");
				guessCorrectly = true;
				break;
			}
			else
				System.out.println("x Wrong guess");
				if(i<attempts)
				{
					System.out.println("Try again");
				}
			
		}
		
		if(!guessCorrectly)
		{
			System.out.println("You've used all attempts. The correct number was: " + targetNumber);
		}

		input.close();
	}

}
