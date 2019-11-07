/* 
	 Project: Program 6
	 Author: Owen Shoemaker
	 github: Owen-3921
	 Description: To make a working bank account
	 Version: 2.0
	 Last Updates: 7 Nov 2019
	 */

import java.util.Scanner;

public class programSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		int menuChoice;
	
		
		
		
		account accOne = new account();
		
		do
		{
		displayMenu();
		menuChoice = keyboard.nextInt();
		
		switch(menuChoice)
		{
		case 1:
			System.out.println("How much money would you like to deposit?");
			accOne.depositAmount = keyboard.nextDouble();
			accOne.accountBalance = account.deposit(accOne.accountBalance, accOne.depositAmount);
			accOne.displayBalance(accOne.accountBalance);
			break;
		case 2:
			System.out.println("How much money would you like to withdraw?");
			accOne.withdrawalAmount = keyboard.nextDouble();
			accOne.accountBalance = account.withdrawal(accOne.accountBalance, accOne.withdrawalAmount);
			accOne.displayBalance(accOne.accountBalance);
			break;
		case 3:
			accOne.displayBalance(accOne.accountBalance);
			break;
		case 4:
			accOne.displayBalance(accOne.accountBalance);
			System.out.println("Thank you,  have a wonderful day!");
			break;
		default:
			System.out.println("That is an invalid choice. Please chosse a valid option.");
		}
		
		
		
		}while(menuChoice !=4);
		
		
		
	}

	
	
	
		
		
	


	public static void displayMenu()
	{
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Deposit");
		System.out.println("2.) Withdrawal");
		System.out.println("3.) View Balance");
		System.out.println("4.) Exit");
		System.out.println("What would you like to do? ");
		
	}

}