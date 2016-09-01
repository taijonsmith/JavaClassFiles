package assignment1package;

import java.util.Scanner;

public class PP2_12 {
	
	public static void main(String[] args) {
		//length of the side of the square
		int length;
		
		Scanner lengthInput = new Scanner(System.in);
		
		System.out.println("Enter a number for the length of a square's side: ");
		
		length = lengthInput.nextInt();
		
		//perimeter of the square
		System.out.println("Perimeter: " + (length*4));
		
		//area of the square
		System.out.println("Area: " + (length*length));
		
		System.out.println("Closing Scanner...");
		lengthInput.close();
		System.out.println("Scanner Closed.");
	}
}