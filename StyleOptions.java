package assignment3package;
//taken from the book program example
import javax.swing.JFrame;

public class StyleOptions {
	public static void main(String[]args) {
	
	JFrame frame = new JFrame("Style Options");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	StyleOptionsPanel panel = new StyleOptionsPanel();
	frame.getContentPane().add(panel);
	frame.pack();
	frame.setVisible(true);
	}
}