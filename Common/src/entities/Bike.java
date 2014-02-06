package entities;

import controls.Controller;
import framework.Graphics;
import framework.Graphics.Colour;
import framework.Sprite;

public class Bike extends Sprite{

	private Colour colour = Colour.WHITE;
	
	public Bike(Controller controller)
	{
		setSpeed(2);
		controller.control(this);
	}
	
	public void setColour(Colour colour)
	{
		this.colour = colour;
	}
	
	public Colour getColour()
	{
		return colour;
	}
	
	@Override
	public void draw(Graphics g)
	{
		g.setColour(getColour());
		g.drawRect(getX()-getWidth()/2, getY()-getHeight()/2, getWidth(), getHeight());
	}
	
	@Override
	public int getWidth()
	{
		return 2;
	}
	
	@Override
	public int getHeight()
	{
		return 2;
	}
}
