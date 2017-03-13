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
		x += xmove;
		y += ymove;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000);
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}	
	
	
	

	
}
