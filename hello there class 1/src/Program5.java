
// Project:		Program 5
// Author:		Owen Shoemaker	
// GitHub:		Owen_3921
// Description: Three methods
// Date:		Oct 21, 2019
// Version:		1.0

import java.util.Scanner;


public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Start keyboard and declare variables
		Scanner keyboard = new Scanner(System.in);
		int menuChoice;
		double balance = 0.00;
		double shares = 0.00;
		double shareAmount = 0.00;
		
		// This Displays menu and also asks the  user for input
		do
		{
		displayMenu();
		menuChoice = keyboard.nextInt();
		
		switch(menuChoice)
		{
		case 1:
			System.out.println("How many would you like to buy?");
			shareAmount = keyboard.nextDouble();
			balance = buy(balance, shareAmount);
			displayBalance(balance);
			break;
		case 2:
			System.out.println("How many would you like to sell?");
			shares = keyboard.nextDouble();
			balance = stocks(balance, shares);
			displayBalance(balance);
			break;
		case 3:
			displayBalance(balance);
			break;
		case 4:
			displayBalance(balance);
			System.out.println("Thank you! have a great day!");
			break;
			
		default:
			System.out.println("That is an invalid choice, please choice a valid choice.");
		}
		
		
		// Stops the program once the user hits 4
		}while(menuChoice !=4);
		
		
		
	}

	// Menu options
	public static void displayMenu()
	{
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Purchase Shares");
		System.out.println("2.) Sell Shares");
		System.out.println("3.) View the amount of shares you own");
		System.out.println("4.) Exit");
		System.out.println("What woulds you like to do? ");
	}
	
	// Method to add to the total amount
	public static double buy(double bal, double buy)
	{
		return (bal+buy);
	}
	
	// Method to erase from the total amount
	public static double stocks(double bal, double sha)
	{
		return (bal-sha);
		
	}
	
	// Method that displays the amount the user have
	public static void displayBalance(double bal)
	{
		if (bal>0)
		System.out.println("You own " + bal + " amount of shares.");
		
		if (bal==0)
		System.out.println("You no longer own any shares.");
		
		if (bal<0)
			System.out.println("You sold more shares than you own. You need to buy more than " + (-bal) + " amount of sharess before you can start selling again.");
		
	}
		}		
		
