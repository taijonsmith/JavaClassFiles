package assignment4package;

import java.awt.*;
import javax.swing.JPanel;

public class CarPanel extends JPanel {
	private int[] xCar = {0, 10, 20, 20, 50, 78, 100, 100};
	private int[] yCar = {30, 10, 10, 5, 0, 15, 15, 30};
	private int[] xDoorKnob = {45, 52};
	private int[] yDoorKnob = {20, 20};
	
	public CarPanel() {
		setBackground(Color.gray);
		setPreferredSize(new Dimension(300, 200));
	}
	
	//Draws car using polygons and polylines
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.setColor(Color.blue);
		page.fillPolygon(xCar, yCar, xCar.length);
		
		page.setColor(Color.black);
		page.drawPolyline(xDoorKnob, yDoorKnob, xDoorKnob.length );
		
		page.setColor(Color.black);
		page.fillOval(15, 27, 15, 15);
		page.fillOval(70, 27, 15, 15);
	}
}