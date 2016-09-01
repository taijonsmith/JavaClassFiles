package assignment3package;

import java.util.ArrayList;

public class Course {
	
	ArrayList <Student> enrollment = new ArrayList <Student>();
	//constructor
	public Course(String className) {
		String name = className;
	}
	
	public void addStudent(Student student) {
		enrollment.add(student);
	}
	
	//returns average of all student's test score averages
	public double average(ArrayList <Student> classAverage) { 	
		double all = 0; //all = total amount of grades
		int x = 0;
		while(x < classAverage.size()) {
			all += classAverage.get(x).testScore;
			x++;
		}
		return (all/classAverage.size());
	}
	
	//prints all students in the course
	public void roll(ArrayList <Student> studentAverages) {
		int y = 0;
		while(y < studentAverages.size()) {
			System.out.println(studentAverages.get(y));
			y++;
		}
	}
}