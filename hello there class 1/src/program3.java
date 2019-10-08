import java.util.Scanner;
public class program3 {
	/* 
	 Project: Program 3 
	 Author: Owen Shoemaker
	 github: Owen-3921
	 Description: Prints out ten different lines
	 Version: 1.0
	 Last Updates: 1 OCT 2019
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name;

Scanner keyboard = new Scanner(System.in);
System.out.println("What is your Name? ");
name = keyboard.next();
System.out.println("Pick a number between 1 and 100. ");
num = keyboard.nextInt();
do {
	System.out.println("Congratulations on picking a number between 1 and 100 "+name+"!!");
}while(num >0 &&num<101);

	
	}
}

