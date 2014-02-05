package framework;

public abstract class Screen{
	
	private Game game;
	
	public Game getGame()
	{
		return game;
	}

	public void init(Game game)
	{
		this.game = game;
	}

	public abstract void run(Game game);

	public abstract void cleanUp();

	public abstract void pause();

	public abstract void resume();

	public abstract void clear(Graphics g);

}
