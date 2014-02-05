package screens;

import implementation.ScreenImp;
import controls.MouseController;
import entities.Bike;
import framework.Game;
import framework.Graphics;

public class BattleScreen extends ScreenImp{

	private Bike bike;

	@Override
	public void init(Game game)
	{
		super.init(game);
		bike = new Bike(new MouseController());
		bike.setPosition(getGame().getScreenWidth() / 2, getGame()
				.getScreenHeight() / 2);
	}

	@Override
	public void draw(Graphics g)
	{
		bike.draw(g);
	}

	@Override
	protected void update(long timePassed)
	{
		bike.update(timePassed);
	}

}
