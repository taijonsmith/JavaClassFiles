package assignment4package;

public class Surgeon extends HospitalEmployees {

	public Surgeon(String occupation, String name, String number ) {
		super(occupation, name, number);
	}
	
	public void info() {
		System.out.println("Occupation: " + occupation);
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + number);
	}
	
	public void tools() {
		System.out.println("ALERT: The surgeon needs surgeon tools!");
	}
	
	public void service() {
		System.out.println("Surgeon performs surgery on a patient");
	}
}