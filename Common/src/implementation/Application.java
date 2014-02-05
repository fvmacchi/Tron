package implementation;

import framework.Game;

public class Application {

	private static Game game;
	
	public static Game getGame()
	{
		return game;
	}
	
	public static void init(Initializer initializer)
	{
		game = initializer.getGame();
		game.startGame(initializer.getStartScreen());
	}
	
}
