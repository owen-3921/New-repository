/* 
	 Project: Program 7
	 Author: Owen Shoemaker
	 github: Owen-3921
	 Description: To make a game between 2 teams using arrays
	 Version: 2.0
	 Last Updates: 7 Nov 2019
	 */


//inports the scanners

import java.util.Random;
import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		Random rnd1 = new Random();
		
		
		System.out.println("Welcome to Kick Ball: the game where you compete in kicking the ball and score runs ");
		System.out.println("How many gamnes do you want to play? ");
		int arraySize = keyboard.nextInt();
		int[] scores = new int[arraySize];
		int totalScore = 0;
		int totalScore1 = 0;
		System.out.print("Team 1 \t Team 2");
		
		//randomizes the scores
		for(int i = 0;i<arraySize;i++)
		{
			scores[i] = rnd.nextInt(100);
			System.out.print("\n" + scores[i]);
			totalScore = totalScore + scores[i];
			scores[i] = rnd.nextInt(100);
			System.out.print("\t" + scores[i]);
			totalScore1 = totalScore1 + scores[i];
			
			

			
			
			
		}
	
		
		System.out.println("\n=~=~=~=~=~=~");
		System.out.println(totalScore + "\t" + totalScore1);
		
	//outputs the total score, declares winner
		for(int u = totalScore; u <=totalScore;u++)
		{
			if(totalScore>totalScore1)
			System.out.println("Team 1 has won.");
			else
			System.out.println("Team 2 has won.");
		}
		
		
		keyboard.close();
		
	}

}
