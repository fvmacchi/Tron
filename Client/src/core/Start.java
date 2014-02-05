package core;

import screens.BattleScreen;
import framework.Game;
import framework.Screen;
import implementation.Application;
import implementation.GameImp;
import implementation.Initializer;

public class Start implements Initializer{

	public static void main(String[] args)
	{
		Application.init(new Start());
	}

	@Override
	public Game getGame()
	{
		return new GameImp();
	}
	
	@Override
	public Screen getStartScreen()
	{
		return new BattleScreen();
	}

}
