package asignment2package;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PP3_6 {
	
	public static void main(String[] args) {
		//variable declarations
		double radius = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the sphere: ");
		radius = input.nextDouble();
		
		/* Math.pow --> method for take the power of a given number
		Surface Area formula of sphere = 4(Pi)r^2; Volume = (4/3)(Pi)r^3*/
		double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		
		//Decimals rounded to four places
		DecimalFormat pFour = new DecimalFormat("0.####");
		
		System.out.println("Surface Area: " + pFour.format(surfaceArea));
		System.out.println("Volume: " + pFour.format(volume));
		
		System.out.println("\nClosing Scanner...");
		input.close();
		System.out.println("Scanner Closed.");
	}
}