package entities;

import java.util.ArrayList;
import java.util.List;

import framework.Graphics;
import framework.Graphics.Colour;
import framework.Screen;
import framework.Sprite;

public class Arena extends Sprite{

	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;

	private List<Bike> bikes = new ArrayList<Bike>();

	private Screen screenContext = null;

	public Arena(Screen context)
	{
		this.screenContext = context;
		setPosition((screenContext.getGame().getScreenWidth() - WIDTH) / 2,
				(screenContext.getGame().getScreenHeight() - HEIGHT) / 2);
	}

	public void addBike(Bike bike)
	{
		bikes.add(bike);
	}

	public List<Bike> getBikes()
	{
		return bikes;
	}

	public void start()
	{
		Bike bike = getBikes().get(0);
		bike.setPosition(WIDTH / 2, HEIGHT / 2);
	}

	@Override
	public void draw(Graphics g)
	{
		g.setColour(Colour.WHITE);
		g.drawRect((screenContext.getGame().getScreenWidth() - WIDTH) / 2,
				(screenContext.getGame().getScreenHeight() - HEIGHT) / 2,
				WIDTH, HEIGHT);
		g.setOffset(getX(), getY());
		for(Bike bike: bikes)
		{
			bike.draw(g);
		}
		g.setOffset(0, 0);
	}

	@Override
	public void update(long timePassed)
	{
		super.update(timePassed);
		for(Bike bike: bikes)
		{
			bike.update(timePassed);
		}
	}

}
