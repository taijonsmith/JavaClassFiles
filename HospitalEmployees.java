package assignment4package;

public class HospitalEmployees {
	
	protected String occupation, name, number;
	
	public HospitalEmployees(String Occupation, String Name, String Number) {
		occupation = Occupation;
		name = Name;
		number = Number;	
	}
	
	//main driver
	public void info() {
		System.out.println("Occupation: " + occupation);
		System.out.println("Name: " + name);
		System.out.println("Number: " + number);
	}
}