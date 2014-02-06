package screens;

import implementation.ScreenImp;
import controls.KeyboardController;
import entities.Bike;
import framework.Game;
import framework.Graphics;
import framework.Graphics.Colour;

public class BattleScreen extends ScreenImp{

	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	
	private Bike bike;

	@Override
	public void init(Game game)
	{
		super.init(game);
		bike = new Bike(new KeyboardController());
		bike.setPosition(getGame().getScreenWidth() / 2, getGame()
				.getScreenHeight() / 2);
	}

	@Override
	public void draw(Graphics g)
	{
		bike.draw(g);
		//Draw arena
		g.setColour(Colour.WHITE);
		g.drawRect((getGame().getScreenWidth()-WIDTH)/2, (getGame().getScreenHeight()-HEIGHT)/2, WIDTH, HEIGHT);
		
	}

	@Override
	protected void update(long timePassed)
	{
		bike.update(timePassed);
	}

}
