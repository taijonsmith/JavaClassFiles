package assignment5package;

public class Senator implements Speaker {
	public void speak() {
		System.out.println("I am Senator Smith, and I am here to talk about "
				+ " politics. ");
	}
	
	public void announce(String str) {
		System.out.println("I am about to announce a new law"
				+ " that is being passed!\n");
	}
}