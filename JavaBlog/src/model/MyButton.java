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
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		this.roundRect = new RoundRectangle2D.Double(this.getX(), this.getY(), width, height, this.getArcWidth(), this.getArcHeight());
		super.setBounds(this.getX(), this.getY(), width, height);
	}
	
	
	
	

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		this.roundRect = new RoundRectangle2D.Double(x,y, this.getWidth(), this.getHeight(), this.getArcWidth(), this.getArcHeight());
		super.setBounds(x, y, this.getWidth(), this.getHeight());
	}
	
	

	public void setScaleSize(double scale) {
		double rectW = roundRect.width;
		double rectH = roundRect.height;
		
		roundRect = new RoundRectangle2D.Double(this.getX(), this.getY(), scale*this.getWidth(), scale*this.getHeight(), scale*this.getArcWidth(), scale*this.getArcHeight());
		super.setBounds((int)(this.getX()+(1-scale)*rectW*0.5), (int)(this.getY()+(1-scale)*rectH*0.5), (int)roundRect.width, (int)roundRect.height);
		
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		g.setColor(backgroundColor);
		g.fillRoundRect(1, 1, getWidth()-2, getHeight()-2, getArcWidth(), getArcHeight());
		
		g.setColor(fontColor);
		
		
		g.drawString(btnText, (getWidth()-2)/2-getBtnTextLength()/4, (getHeight()-2+getBtnTextHeight())/2);
		
	}
	

//	private void setArcHeight(int arcH) {
//		roundRect = new RoundRectangle2D.Double(roundRect.x, roundRect.y, roundRect.width, roundRect.height, roundRect.arcwidth, arcH);
//	}
	
	private int getArcHeight() {
		
		return (int)roundRect.getArcHeight();
	}
	
//	private void setArcWidth(int arcW) {
//		roundRect = new RoundRectangle2D.Double(roundRect.x, roundRect.y, roundRect.width, roundRect.height, arcW, roundRect.archeight);
//	}
	
	private int getArcWidth() {
	
		return (int)roundRect.getArcWidth();
	}

	private int getBtnTextLength() {
		return this.btnText.length()*this.getFont().getSize();
	}
	
	private int getBtnTextHeight() {
		return this.getFont().getSize();
	}



	
	
	
	
	
}
