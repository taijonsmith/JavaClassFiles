package assignment4package;

import javax.swing.JFrame;

public class CarMain {
	
	//main frame of program
	public static void main(String[] args) {
		JFrame frame = new JFrame("Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarPanel car = new CarPanel();
		
		frame.getContentPane().add(car);
		frame.pack();
		frame.setVisible(true);
	}
}