package assignment4package;

import java.util.Scanner;

public class IntegerReader {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int zero = 0, fifty = 50; //max & min of values that can be entered
		int number; //number that user inputs
		int[] integerInput = new int[fifty + 1];
		
		for (int x = 0; x < integerInput.length; x++) {
			integerInput[x] = 0;
		}
		
		System.out.println("To end the program, enter a number larger than 50\n");
		System.out.print("Enter an integer from 0-50: ");
		number = scan.nextInt();
		
		//while user enters a value from 0 to 50, scan next value
		while (number >= zero && number <= fifty) {
			integerInput[number] = integerInput[number] + 1;
			System.out.print("Enter an integer from 0-50: ");
			number = scan.nextInt();
		}
		
		System.out.println("\nNumber of occurrences: ");
		
		//if values are from 0-50, enter them and frequency of occurrences
		for (int x = 0; x < integerInput.length; x++) {
			if (integerInput[x] > 0) {
				System.out.print(x + ": "+integerInput[x] + "\n");
			}
		}
	}
}