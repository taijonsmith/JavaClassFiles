package assignment4package;

import javax.swing.JFrame;
import java.awt.Color;

public class CarMain2 {
	
	//main frame of program
	public static void main(String[] args) {
		JFrame frame = new JFrame("Driving Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new MovingCar(100, 100, Color.blue));
		frame.pack();
		frame.setVisible(true);
	}
}