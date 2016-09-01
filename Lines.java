package assignment3package;

import java.util.Random;
import javax.swing.JPanel;
import java.awt.*;

public class Lines extends JPanel {
	
	private int lineLength, x1 = 5, x2, y1 = 5, y2;
	private Random randomLine; //random lengths
	//line constructor
	public Lines() {
		randomLine = new Random();
		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.red);
	}
	
	public void paintComponent (Graphics graphics) {
		super.paintComponent(graphics);
		int i;
		//random lines drawn 20 times
		for(i = 0; i < 20; i++) {
			lineLength = randomLine.nextInt(300) + 1;
			
			//lines drawn
			x2 = x1 + lineLength;
			y1 = y1 + 19;
			y2 = y1;
			graphics.setColor(Color.blue);
			graphics.drawLine(x1, y1, x2, y2);
		}
	}
}