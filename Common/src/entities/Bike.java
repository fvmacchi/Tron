package entities;

import controls.Controller;
import framework.Graphics;
import framework.Graphics.Colour;
import framework.Sprite;

public class Bike extends Sprite{

	public Bike(Controller controller)
	{
		setSpeed(1);
		controller.control(this);
	}
	
	@Override
	public void draw(Graphics g)
	{
		g.setColour(Colour.BLUE);
		g.drawRect(getX()-getWidth()/2, getY()-getHeight()/2, getWidth(), getHeight());
	}
	
	@Override
	public int getWidth()
	{
		return 10;
	}
	
	@Override
	public int getHeight()
	{
		return 10;
	}
}
