package controls;

import entities.Arena;

public class ComputerController extends Controller{

	private Arena arena = null;
	
	private int timeBetweenTurn = 300;
	
	private int timeLastPassed = 0;

	public ComputerController(Arena arena)
	{
		this.arena = arena;
	}

	@Override
	public void update(long timePassed)
	{
		timePassed /= 1000000;
		if(timePassed + timeLastPassed < timeBetweenTurn)
		{
			timeLastPassed += timePassed;
			return;
		}
		timeLastPassed = (int)(timeLastPassed + timePassed - timeBetweenTurn);
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
			System.out.println(direction);
			break;
		}
	}
}
