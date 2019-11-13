/* 
	 Project: Program 8
	 Author: Owen Shoemaker
	 github: Owen-3921
	 Description: To make a game between 2 teams using arrays
	 Version: 1.0
	 Last Updates: 12 Nov 2019
	 */


import java.io.*;
import java.util.Scanner;

public class prgram8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Open file for use
		File fw = new File("/Users/eliasmobrin/Desktop/grades.txt");
		Scanner inputFile = new Scanner(fw);
				
		// Open/Create output file
		FileWriter tempFile = new FileWriter("/Users/eliasmobrin/Desktop/gradesTotal.txt");
		PrintWriter outputFile = new PrintWriter(tempFile);
		
		// Create variable for the total amount
		double total = 0;
		
		
		// Loop through the input file
		while(inputFile.hasNext())
		{
			char category = inputFile.next().charAt(0);
			double gradeAmount = inputFile.nextDouble();
		
			
			switch(category)
			{
				case 'G':
					total+=gradeAmount;
					break;
			}
		}
		
		
		// Output totals by category
		double obtainedScore= total, totalScore= 1500;
		float Percentage;						

		Percentage = (float) ((obtainedScore*100/totalScore));



		//Output totals by category
		outputFile.println("Grade Statistics");
		outputFile.println("================");
		outputFile.printf("Total: %.0f ", total);
		outputFile.printf("\nNumber of Grades: 15");
		outputFile.printf("\nAverage: " + Percentage + "%%\n");
		
		
		
		
		// Closing the files
			outputFile.close();
			inputFile.close();
		}
}
