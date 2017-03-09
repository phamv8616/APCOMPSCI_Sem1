public class Honda implements Location
{
	private double[] location = new double[2];
	
	public Honda()
	{
		location[0] = 0;
		location[1] = 1;
	}
	
	public Honda(double[] loc)
	{
		location[0] = loc[0];
		location[1] = loc[1];
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000);
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
