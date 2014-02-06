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
	
	private boolean battleInProgress = false;

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
		int numBikes = getBikes().size();
		Bike bike = null;
		switch (numBikes)
		{
		case 4:
			bike = bikes.get(3);
			bike.setPosition(WIDTH / 4, 3 * HEIGHT / 4);
			bike.setColour(Colour.YELLOW);
		case 3:
			bike = bikes.get(2);
			bike.setPosition(3 * WIDTH / 4, HEIGHT / 4);
			bike.setColour(Colour.GREEN);
		case 2:
			bike = getBikes().get(1);
			bike.setPosition(3 * WIDTH / 4, 3 * HEIGHT / 4);
			bike.setColour(Colour.RED);
		case 1:
			bike = getBikes().get(0);
			bike.setPosition(WIDTH / 4, HEIGHT / 4);
			bike.setColour(Colour.BLUE);
		}
		battleInProgress = true;
	}

	public boolean isBattleInProgress()
	{
		return battleInProgress;
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
	
	public void cleanUp()
	{
		battleInProgress = false;
	}
	
}
