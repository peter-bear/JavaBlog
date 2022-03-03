package model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.geom.RoundRectangle2D;



public class MyButton extends Component{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RoundRectangle2D.Double roundRect;
	private String btnText="";
	private Color backgroundColor = Color.BLACK;
	private Color fontColor = Color.BLACK;
	
	
	public MyButton(int x, int y, int width, int height, int arcW, int arcH) {
		this.roundRect = new RoundRectangle2D.Double(x, y, width, height, arcW, arcH);
		super.setBounds(x, y, width, height);
		
		
	}
	
	
	
	


	public Color getFontColor() {
		return fontColor;
	}

	public void setFontColor(Color fontColor) {
		this.fontColor = fontColor;
	}

	public void setBackgroundColor(Color color) {
		this.backgroundColor = color;
	}
	
	public Color getBackgroundColor() {
		return backgroundColor;
	}
	
	public void setBtnText(String txt) {
		this.btnText = txt;
	}
	
	public String getBtnText() {
		return btnText;
	}
	
	
	
	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(backgroundColor);
		g.fillRoundRect(1, 1, getWidth()-2, getHeight()-2, getArcWidth(), getArcHeight());
		
		g.setColor(fontColor);
		
		
		g.drawString(btnText, (getWidth()-2)/2-getBtnTextLength()/4, (getHeight()-2+getBtnTextHeight())/2);
		
	}
	



	private int getBtnTextLength() {
		return this.btnText.length()*this.getFont().getSize();
	}
	
	private int getBtnTextHeight() {
		return this.getFont().getSize();
	}


	private int getArcHeight() {
		
		return (int)roundRect.getArcHeight();
	}
	

	private int getArcWidth() {
	
		return (int)roundRect.getArcWidth();
	}
	
	
	
	
	
}
