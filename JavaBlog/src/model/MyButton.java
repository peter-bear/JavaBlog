package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import javax.swing.JButton;


public class MyButton extends JButton{
	

	private RoundRectangle2D.Double roundRect;
	private Color color = Color.BLACK;
	
	
	
	public MyButton(int x, int y, int width, int height, int arcW, int arcH) throws IOException {
		this.roundRect = new RoundRectangle2D.Double(x, y, width, height, arcW, arcH);
	}

	public int getX() {
		return (int)roundRect.getX();
	}
	
	public int getY() {
		return (int)roundRect.getY();
	}
	
	public int getWidth() {
		return (int)roundRect.getWidth();
	}
	
	public int getHeight() {
		return (int)roundRect.getHeight();
	}
	
	public int getArcWidth() {
		return (int)roundRect.getArcWidth();
	}
	
	public int getArcHeight() {
		return (int)roundRect.getArcHeight();
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
//		g.drawRoundRect(getX(), getY(), getWidth(), getHeight(),getArcWidth(), getArcHeight());
		g.setClip(roundRect);
		super.paint(g);
		
		
	}
	
	
	
	
	
}
