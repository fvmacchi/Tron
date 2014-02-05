package controls;

import implementation.Application;
import implementation.GameImp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import entities.Bike;

public class MouseController extends Controller implements MouseListener,
		MouseMotionListener{

	private boolean dragging = false;

	@Override
	public void control(Bike bike)
	{
		super.control(bike);
		((GameImp)Application.getGame()).getScreenManager()
				.getFullScreenWindow().addMouseListener(this);
		((GameImp)Application.getGame()).getScreenManager()
				.getFullScreenWindow().addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		dragging = !dragging;
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		if(dragging)
		{
			getBike().setX(e.getX());
			getBike().setY(e.getY());
		}
	}

}
