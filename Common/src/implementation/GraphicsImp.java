package implementation;

import java.awt.Color;
import java.awt.Graphics2D;

import framework.Graphics;
import framework.Image;

public class GraphicsImp implements Graphics{

	private Graphics2D g;

	private double scale = 1;

	private int offsetX = 0;
	private int offsetY = 0;

	public GraphicsImp(Graphics2D g)
	{
		this.g = g;
	}

	@Override
	public void drawImage(Image image, int x, int y)
	{
		g.drawImage(((ImageImp)image).getImage(), applyTransformationX(x),
				applyTransformationY(y), null);
	}

	@Override
	public void drawString(String string, int x, int y)
	{
		g.drawString(string, applyTransformationX(x), applyTransformationY(y));
	}

	@Override
	public void drawRect(int x, int y, int width, int height)
	{
		g.drawRect(applyTransformationX(x), applyTransformationY(y),
				applyScale(width), applyScale(height));
	}

	@Override
	public void drawRect(double x, double y, double width, double height)
	{
		drawRect((int)x, (int)y, (int)width, (int)height);
	}

	@Override
	public void fillRect(int x, int y, int width, int height)
	{
		g.fillRect(applyTransformationX(x), applyTransformationY(y),
				applyScale(width), applyScale(height));
	}

	@Override
	public void setColour(int r, int g, int b, int a)
	{
		this.g.setColor(new Color(r, g, b, a));
	}

	@Override
	public void setColour(int r, int g, int b)
	{
		setColour(r, g, b, 255);
	}

	@Override
	public void setColour(Colour colour)
	{
		setColour(colour.getRed(), colour.getGreen(), colour.getBlue());
	}

	@Override
	public void setScale(double scale)
	{
		this.scale = scale;
	}

	@Override
	public void setOffset(double x, double y)
	{
		this.offsetX = (int)x;
		this.offsetY = (int)y;
	}

	@Override
	public double getScale()
	{
		return scale;
	}

	@Override
	public int getOffsetX()
	{
		return offsetX;
	}

	@Override
	public int getOffsetY()
	{
		return offsetY;
	}

	@Override
	public void dispose()
	{
		g.dispose();
	}

	private int applyTransformationX(int x)
	{
		return (int)((x + getOffsetX()) / getScale());
	}

	private int applyTransformationY(int y)
	{
		return (int)((y + getOffsetY()) / getScale());
	}

	private int applyScale(double quantity)
	{
		return (int)(quantity * scale);
	}
}
