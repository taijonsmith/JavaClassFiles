package assignment5package;

public class SpeakerDriver {

	public static void main(String[] args) {
		Speaker function1, function2, function3;
		
		function1 = new Senator();
		function1.speak();
		function1.announce("");
		
		function2 = new Attorney();
		function2.speak();
		function2.announce("");
		
		function3 = new Preacher();
		function3.speak();
		function3.announce("");
	}

}