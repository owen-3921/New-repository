

// Project:		Program 3
// Author:		Owen Shoemaker	
// GitHub:		owen-3921
// Description: Loop
// Date:		Dec 4, 2019
// Version:		2.0

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start keyboard
		int number;
	    String name;
	    int onSwitch=1;
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("What is your name? ");
	    name = keyboard.next();
	    System.out.println("Pick a number between 0 and 100.");
	    number = keyboard.nextInt();
		
		// While loop - check if the chosen number is between 1 and 100
		while(onSwitch ==1) {
			if(number >=0 && number<101) {
				System.out.println("Thank you for your input "+name+".");
		    	onSwitch = 0;
			}
			else {
				System.out.println("Please select a number between 1 and 100");
	    		number = keyboard.nextInt();
			}
		} // The end of the while loop
		
			for(int i= number;i<=100;i++) {
				if(i>=100) {
					System.out.println(i + " people has left the store" + " \nEveryone has now left, there is now " + (100-i) + " people in the store");
			}
				else {
					System.out.println(i + " people has left the store" + " \nOne more person left, there is now " + (100-i) + " people in the store");
		}
		
	}
			keyboard.close();
	}
}
	