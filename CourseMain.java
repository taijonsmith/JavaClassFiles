package assignment3package;

import java.text.DecimalFormat;

public class CourseMain {
	public static void main(String[] args)
	{
		Student TaiJon = new Student("TaiJon", "Smith", 92.0);
		Student Mike = new Student("Mike", "Flannery", 95.0);
		Student Rico = new Student("Rico", "Carrico", 78.0);
		Course calculus = new Course("Calculus");
		
		calculus.addStudent(TaiJon);
		calculus.addStudent(Mike);
		calculus.addStudent(Rico);
		calculus.roll(calculus.enrollment);
		
		//Decimals rounded to two places
		DecimalFormat pTwo = new DecimalFormat("0.##");
		//class average test grade
		System.out.print("Class Test Average: " + 
		pTwo.format(calculus.average(calculus.enrollment)) + "%");
	}
}