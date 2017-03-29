public class Car implements Location
{
	private double[] location;
	public int ID = (int)(Math.random() * 100000);
	
	public Car()
	{
		location = new double[2];
	}

	public int getID()
	{
		return ID;
	}
	
	public void move(double xmove, double ymove)
	{
		location[0] += xmove;
		location[1] += ymove;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	
	

	
}
