import java.util.Scanner;

public class  program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare variables
		int first = 0;
		
		int second = 0;
		
		int third = 0;
		
		//start keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//collect input
		System.out.print("What is your favorite number? " );
		first = keyboard.nextInt();
		
		System.out.print("What is your favorite number? " );
		second = keyboard.nextInt();
		
		System.out.print("What is your favorite number? " );
		third = keyboard.nextInt();
		 
		System.out.println("1. Add " );
		System.out.println("2. Subtract " );
		System.out.println("3. Multiply " );
		System.out.println("4. Divide " );
		int choice = keyboard.nextInt();
		double ans; 
		switch (choice){
		case 1: //formula for addition
			ans = first + second;
			System.out.println(first + " + " + second + " = " + ans);
			if(ans>third) {
				
		     System.out.println(ans + " is greater than " + third);
		     
			}
			else if(ans<third) {
				
				System.out.println(ans + " is less than " + third);
				
			}
			else {
				
				System.out.println(ans + " is equal to " + third);
				
				}
			break;
		case 2: //formula for subtraction
			ans = first - second;
			System.out.println(first + " - " + second + " = " + ans);
			if(ans>third) {
				
		     System.out.println(ans + " is greater than " + third);
		     
			}
			else if(ans<third) {
				
				System.out.println(ans + " is less than " + third);
				
			}
			else {
				
				System.out.println(ans + " is equal to " + third);
				
				}
			break;
		case 3: //formula for multiplication
			ans = first * second;
			System.out.println(first +" x "+ second + " = " + ans);
			if(ans>third) {
				
		     System.out.println(ans + " is greater than " + third);
		     
			}
			else if(ans<third) {
				
				System.out.println(ans + " is less than " + third);
				
			}
			else {
				
				System.out.println(ans + " is equal to " + third);
				
				}
			break;
		case 4: //formula for division
			ans = first / second;
			System.out.println(first +" / "+ second + " = " + ans);
			if(ans>third) {
				
		     System.out.println(ans + " is greater than " + third);
		     
			}
			else if(ans<third) {
				
				System.out.println(ans + " is less than " + third);
				
			}
			else {
				
				System.out.println(ans + " is equal to " + third);
				
				}
			break;
			
		}
		
		
		
		
		
		

	}

}
