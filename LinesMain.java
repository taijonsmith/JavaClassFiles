package assignment3package;

import javax.swing.JFrame;

public class LinesMain {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Lines panel = new Lines();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}