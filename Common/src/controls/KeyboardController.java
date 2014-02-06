package controls;

import implementation.Application;
import implementation.GameImp;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Bike;

public class KeyboardController extends Controller implements KeyListener{

	@Override
	public void control(Bike bike)
	{
		super.control(bike);
		((GameImp)Application.getGame()).getScreenManager()
				.getFullScreenWindow().addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_UP:
			getBike().moveUp();
			break;
		case KeyEvent.VK_DOWN:
			getBike().moveDown();
			break;
		case KeyEvent.VK_LEFT:
			getBike().moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			getBike().moveRight();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
