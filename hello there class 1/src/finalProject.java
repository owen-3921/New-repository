// Project:		Final Project
// Author:		Owen Shoemaker	
// GitHub:		owen-3921
// Description: 
// Date:		Dec 6, 2019
// Version:		1.0



import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class finalProject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		// Open/create output file. 
		FileWriter tempFile = new FileWriter("/Users/oshoemaker/Desktop/totalScore.txt");
		PrintWriter outputFile = new PrintWriter(tempFile);
		
		// Start the keyboard and create two random values.
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		Random rnd1 = new Random();
		
	
		
				
		// Out putting the purpose of the game and also the name. Also asks the user for an input.
		System.out.println("Welcome to the game of kickball - the game where you see who can score the most points");
		System.out.println("You need 20 dollars to enter the competiton.");
		
		int menuChoice;
		
		
		
		do 
		{
		displayMenu();
		menuChoice = keyboard.nextInt();
		
		switch(menuChoice)
		{
		case 1:
			System.out.println("You have paid the fee of the 20 dollars to enter!!");
			break;
		case 2:
			System.out.println("Thanks you - have a nice day!");
			break;
		default:
			System.out.println("That is an invalid option. Please re-enter a valid option.");
		}
		
		
		}while(menuChoice !=1);
		
			
		
		System.out.println("How many innings do you want to play? ");
	
				
		// Create array depending on users input. 
			int arraySize = keyboard.nextInt();
			int[] scores = new int[arraySize];
			int totalScore = 0;
			int totalScore1 = 0;
			outputFile.print("Blue team \t Red team");
		
		// A loop that creates random values and outputs adds it to the total score for each team.
		for(int i = 0;i<arraySize;i++)
		{
			scores[i] = rnd.nextInt(100);
			outputFile.print("\n" + scores[i]);
			totalScore = totalScore + scores[i];
			scores[i] = rnd.nextInt(100);
		    outputFile.print("\t" + scores[i]);
			totalScore1 = totalScore1 + scores[i];	
		}
			
		// Outputs the total score of the games
			outputFile.println("\n=~=~=~=~=~=~");
			outputFile.println(totalScore + "\t" + totalScore1);
			
		// A Loop that calculates and outputs which team has won.
			for(int u = totalScore; u <=totalScore;u++)
			{
				if(totalScore>totalScore1)
				outputFile.println("Blue team has won.");
				else
				outputFile.println("Red team has won."); 
				
				if (totalScore==totalScore1)
				outputFile.println("the game ended in a tie");
			}
			
			// Closing the keyboard and the file
				outputFile.close();
				keyboard.close();
			
			}
				
			public static void displayMenu()
			{
				System.out.println("Menu");
				System.out.println("=========");
				System.out.println("1.) Pay fee");
				System.out.println("2.) Think about whether you want to spend the money");
				System.out.println("What do you want to do?");
			
		
	}
	
			
	
			
			
		
		
		
	}
