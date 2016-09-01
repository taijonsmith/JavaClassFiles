package assignment5package;

public class Attorney implements Speaker {
	public void speak() {
		System.out.println("Good morning your honor, my name is attorney Michael "
				+ " Wilson.");
	}
	
	public void announce(String str) {
		System.out.println("Your honor my client is innocent.\n");
	}
}