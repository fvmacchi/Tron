package implementation;

import java.awt.Color;
import java.awt.Graphics2D;

import framework.Graphics;
import framework.Image;

public class GraphicsImp implements Graphics{

	private Graphics2D g;
	
	public GraphicsImp(Graphics2D g)
	{
		this.g = g;
	}
	
	@Override
	public void drawImage(Image image, int x, int y) {
		g.drawImage(((ImageImp) image).getImage(), x, y, null);
	}

	@Override
	public void drawString(String string, int x, int y) {
		g.drawString(string, x, y);
	}

	@Override
	public void drawRect(int x, int y, int width, int height) {
		g.drawRect(x, y, width, height);
	}
	
	@Override
	public void drawRect(double x, double y, double width, double height)
	{
		drawRect((int)x, (int)y, (int)width, (int)height);
	}

	@Override
	public void fillRect(int x, int y, int width, int height) {
		g.fillRect(x, y, width, height);
	}

	@Override
	public void setColour(int r, int g, int b, int a) {
		this.g.setColor(new Color(r, g, b, a));
	}

	@Override
	public void setColour(int r, int g, int b) {
		setColour(r, g, b, 255);
	}

	@Override
	public void setColour(Colour colour)
	{
		setColour(colour.getRed(), colour.getBlue(), colour.getGreen());
	}
	
	@Override
	public void dispose() {
		g.dispose();
	}

}
