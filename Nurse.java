package assignment4package;

public class Nurse extends HospitalEmployees {

	public Nurse(String occupation, String name, String number ) {
		super(occupation, name, number);
	}
	
	public void info() {
		System.out.println("Occupation: " + occupation);
		System.out.println("Name: " + name);
		System.out.println("Phone Number: " + number);
	}
	
	public void meds() {
		System.out.println("ALERT: The nurse needs meds for a patient!");
	}
	
	public void service() {
		System.out.println("Nurse tends to a patient");
	}
}