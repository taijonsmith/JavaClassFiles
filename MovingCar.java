package assignment4package;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JPanel;

public class MovingCar extends JPanel {
	private int xMove = 1; //moves car 1 pixel
	private int DELAY = 15, x, y;
	private Timer timer;
	private Car car;
	
	//sets up location/position of car
	public MovingCar(int xLocation, int yLocation, Color color) {
		setBackground(Color.gray);
		setPreferredSize(new Dimension(400, 200));
		x = xLocation;
		y = yLocation;
		car = new Car(x,y,color);
		timer = new Timer(DELAY, new CarListener());
		timer.start();
	}
		
	//Draws car using polygons and polylines
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		car.draw(page);
	}
	
	private class CarListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			x += xMove; //moves car through incrementation
			
			if(x > getWidth()-100) //used to know when to restart driving movement
				x = 0;
			
			car.setPosition(x, y);
			repaint();
		}
	}
}