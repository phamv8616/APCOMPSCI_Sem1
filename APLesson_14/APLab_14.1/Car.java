public class Car implements Location
{
	private double[] location;
	public int ID;
	
	public Car()
	{
		location = new double[2];
	}

	public void move(double xmove, double ymove)
	{
		location[0] += xmove;
		location[1] += ymove;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000);
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	
	

	
}
