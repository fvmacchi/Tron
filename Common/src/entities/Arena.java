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
	}

	public void addBike(Bike bike)
	{
		bikes.add(bike);
	}

	@Override
	public void draw(Graphics g)
	{
		for(Bike bike: bikes)
		{
			bike.draw(g);
		}
		g.setColour(Colour.WHITE);
		g.drawRect((screenContext.getGame().getScreenWidth() - WIDTH) / 2,
				(screenContext.getGame().getScreenHeight() - HEIGHT) / 2,
				WIDTH, HEIGHT);
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
