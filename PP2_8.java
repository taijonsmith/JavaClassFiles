package assignment1package;

import java.util.Scanner;

public class PP2_8 {

	public static void main(String[] args) {
		int hours, minutes, inputSeconds, outputSeconds; //time variables
		
		Scanner timeInput = new Scanner(System.in);
		
		//user enters desired number of hours, minutes, and seconds
		System.out.println("Please type in a number of hours: ");
		
		hours = timeInput.nextInt(); // scans integer value entered in by user
		
		System.out.println("Please type in a number of minutes: ");
		
		minutes = timeInput.nextInt();
		
		System.out.println("Please type in a number of seconds: ");
		
		inputSeconds = timeInput.nextInt();
		
		//conversion for user's values into total seconds
		outputSeconds = (hours*3600)+(minutes*60)+(inputSeconds);
		
		//output for total number of seconds
		System.out.println("Total number of seconds entered: " + outputSeconds);
		
		//closes scanner
		System.out.println("Closing Scanner...");
		timeInput.close();
		System.out.println("Scanner Closed.");
	}

}