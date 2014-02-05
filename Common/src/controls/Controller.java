package controls;

import entities.Bike;

public abstract class Controller{

	private Bike bike;
	
	public void control(Bike bike)
	{
		this.bike = bike;
	}
	
	protected Bike getBike()
	{
		return bike;
	}
	
}
