package framework;

public class Point {

	private double x, y;
	
	public Point()
	{
		this(0, 0);
	}
	
	public Point(double x, double y)
	{
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
