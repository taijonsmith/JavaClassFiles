package assignment4package;

public class Doctor extends HospitalEmployees {

	public Doctor(String occupation, String name, String number ) {
		super(occupation, name, number);
	}
	
	public void info() {
		System.out.println("Occupation: " + occupation);
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + number);
	}
	
	public void service() {
		System.out.println("Doctor takes care of a patient");
	}
}