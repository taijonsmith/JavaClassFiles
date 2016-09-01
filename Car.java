package assignment4package;

import java.awt.*;

public class Car {
	private Color color;
	private Polygon fillBlueCar;
	private int[] x = {0, 10, 20, 20, 50, 78, 100, 100};//car location on applet
	private int[] y = {30, 10, 10, 5, 0, 15, 15, 30};
	private int[] xLocation = new int [x.length], yLocation = new int [y.length];
	private int nextX, nextY;
	
	//for moving car
	public Car(int xMove, int yMove, Color color) {
		this.color = color;
		int i;
		nextX = xMove;
		nextY = yMove;
		
		for(i = 0; i < x.length; i++) {
			xLocation[i] = x[i] + nextX;
			yLocation[i] = y[i] + nextY;
		}
		fillBlueCar = new Polygon(xLocation, yLocation, x.length); //fill car color
	}
	
	public void setPosition(int afterX, int afterY) {
		fillBlueCar.translate(afterX - nextX,  afterY - nextY);
		nextX = afterX;
		nextY = afterY;
	}
	
	public void draw(Graphics page) {
		page.setColor(color); //car color (blue)
		page.fillPolygon(fillBlueCar);
		page.setColor(Color.black);//both wheels
		page.fillOval(10 + nextX, 30 + nextY,  15,  15);
		page.fillOval(60 + nextX, 30 + nextY,  15,  15);
	}
}