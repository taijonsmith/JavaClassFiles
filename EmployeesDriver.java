package assignment4package;

public class EmployeesDriver {
	
	public static void main(String[] args) {
	
		Doctor doctor = new Doctor("Doctor", "Dr. Blair", "5026135473");
		Nurse nurse = new Nurse("Nurse", "Nurse Hudson", "5028473748");
		Surgeon surgeon = new Surgeon("Surgeon", "Jack the Surgeon", "5024383844");
		
		//employee's methods
		doctor.info();
		doctor.service();
		System.out.println("\n");
		
		nurse.info();
		nurse.meds();
		nurse.service();
		System.out.println("\n");
		
		surgeon.info();
		surgeon.tools();
		surgeon.service();
		System.out.println("\n");
	}
}