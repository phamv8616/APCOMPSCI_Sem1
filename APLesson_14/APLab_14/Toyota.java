public class Toyota implements Location
{
	private double[] location = new double[2];
	
	public Toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String c)
	{
		String[] coordinates = c.split(",");
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
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
