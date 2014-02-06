package controls;

import implementation.Application;
import entities.Arena;
import entities.Bike;

public class ComputerController extends Controller implements Runnable{

	private Arena arena = null;

	public ComputerController(Arena arena)
	{
		this.arena = arena;
	}

	@Override
	public void control(Bike bike)
	{
		super.control(bike);
		Thread thread = new Thread(this);
		Application.getGame().getThreads().add(thread);
		thread.start();
	}

	@Override
	public void run()
	{
		while (arena.isBattleInProgress())
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int direction = (int)(Math.random() * 4) + 1;
			switch (direction)
			{
			case 1:
				getBike().moveUp();
				break;
			case 2:
				getBike().moveDown();
				break;
			case 3:
				getBike().moveLeft();
				break;
			case 4:
				getBike().moveRight();
				break;
			default:
				break;	
			}
		}
	}

}
