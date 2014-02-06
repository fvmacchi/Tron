package framework;

public interface Graphics{

	public void drawImage(Image image, int x, int y);

	public void drawString(String string, int x, int y);

	public void drawRect(int x, int y, int width, int height);
	
	public void drawRect(double x, double y, double width, double height);

	public void fillRect(int x, int y, int width, int height);

	public void setColour(int r, int g, int b, int a);

	public void setColour(int r, int g, int b);
	
	public void setColour(Colour colour);

	public void setScale(double scale);
	
	public void setOffset(double x, double y);
	
	public double getScale();
	
	public int getOffsetX();
	
	public int getOffsetY();
	
	public void dispose();

	public enum Colour{

		WHITE(255, 255, 255),
		BLACK(0, 0, 0),
		BLUE(0, 0, 255),
		RED(255, 0, 0),
		GREEN(0, 255, 0);

		private int red, green, blue;

		private Colour(int red, int green, int blue)
		{
			this.red = red;
			this.green = green;
			this.blue = blue;
		}

		public int getRed()
		{
			return red;
		}

		public int getGreen()
		{
			return green;
		}

		public int getBlue()
		{
			return blue;
		}

	}

}
