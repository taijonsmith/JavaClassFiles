package asignment2package;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PP3_7 {
	
	public static void main(String[] args) {
		//variable declarations
		double s1, s2, s3, hPerimeter, area;
		Scanner input = new Scanner(System.in);
		
		//user inputs triangle side values
		System.out.println("Enter the length of side 1: ");
		s1 = input.nextDouble();
				
		System.out.println("Enter the length of side 2: ");
		s2 = input.nextDouble();
		
		System.out.println("Enter the length of side 3: ");
		s3 = input.nextDouble();
		
		//half perimeter and area formulas
		hPerimeter = (1.0/2.0)*(s1 + s2 + s3);
		area = Math.sqrt(hPerimeter * (hPerimeter-s1) * (hPerimeter-s2)
				* (hPerimeter-s3));
		
		//Decimals rounded to three places
		DecimalFormat pThree = new DecimalFormat("0.###");
		
		System.out.println("Area of triangle: " + pThree.format(area));
		
		//Scanner closes
		System.out.println("\nClosing Scanner...");
		input.close();
		System.out.println("Scanner Closed.");		
	}
}