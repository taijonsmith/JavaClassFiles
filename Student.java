package assignment3package;

public class Student {
	private String	firstName, lastName;
	public double testScore;

	public Student(String first, String last, double score) {
		firstName = first;
		lastName = last;
		testScore = score;		
	}

	public String toString() {
		String result = firstName + " " + lastName + "\n";
		result += "Test Score Average:\n" + testScore + "\n";
		return result;
	}
}