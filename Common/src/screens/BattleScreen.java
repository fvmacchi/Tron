package screens;

import implementation.ScreenImp;
import controls.ComputerController;
import controls.KeyboardController;
import entities.Arena;
import entities.Bike;
import framework.Game;
import framework.Graphics;

public class BattleScreen extends ScreenImp{

	private Arena arena = null;
	
	@Override
	public void init(Game game)
	{
		super.init(game);
		arena = new Arena(this);
		arena.addBike(new Bike(new KeyboardController()));
		arena.addBike(new Bike(new ComputerController(arena)));
		arena.addBike(new Bike(new ComputerController(arena)));
		arena.addBike(new Bike(new ComputerController(arena)));
		arena.start();
	}

	@Override
	public void draw(Graphics g)
	{
		arena.draw(g);
	}

	@Override
	protected void update(long timePassed)
	{
		arena.update(timePassed);
	}
	
	@Override
	public void cleanUp()
	{
		super.cleanUp();
		arena.cleanUp();
	}

}
