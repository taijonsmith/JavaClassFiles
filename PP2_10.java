package assignment1package;

import java.util.Scanner;

public class PP2_10 {

	public static void main(String[] args) {
		//variables for monetary values
		int pennies, nickels, dimes, quarters, dollars;
		
		Scanner coinInput = new Scanner(System.in);
		
		//scanning user input values 
		System.out.println("Pennies in the jar: ");
		pennies = coinInput.nextInt();
		
		System.out.println("Nickels in the jar: ");
		nickels = coinInput.nextInt();
		
		System.out.println("Dimes in the jar: ");
		dimes = coinInput.nextInt();
		
		System.out.println("Quarters in the jar: ");
		quarters = coinInput.nextInt();
		
		//converts values into cents
		int cents = pennies + (nickels*5) + (dimes*10) + (quarters*25);
		
		//converts cents into greatest possible numbers of dollars
		dollars  = cents/100;
		
		//takes remaining cents (after dollar conversion) and uses them for cents place after the decimal 
		cents = cents %100;
		
		//outputs total amount of money in the jar
		System.out.println("Money in the jar:\n" + dollars + " dollar(s) and " + cents + " cents " + "($"+ dollars +
				"." + cents + ")");
		
		System.out.println("Closing Scanner...");
		coinInput.close();
		System.out.println("Scanner Closed.");
	}
}