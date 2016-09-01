package asignment2package;

import java.util.Scanner;
import java.util.Random;

public class PP3_1 {
	
	public static void main(String[] args) {
		//variable declarations
		String firstName;
		String lastName;
		int randInt; //random integer
		Scanner input = new Scanner(System.in);
		Random randGenerator = new Random(); //generates random #
		
		System.out.println("Please enter your first name: ");
		
		firstName = input.next();
		
		System.out.println("Please enter your last name: ");
		
		lastName = input.next();
			
		randInt = randGenerator.nextInt(90) + 10; //random number from 10-99
		
		System.out.println("Result: "+ firstName.charAt(0) + lastName.substring(0,5)
		+ randInt); //prints first letter of first name, first 5 letters of last name
		//...and a random number from 10-99
		
		System.out.println("\nClosing Scanner...");
		input.close(); //closes scanner
		System.out.println("Scanner Closed."); 
	}
}