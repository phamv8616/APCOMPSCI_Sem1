public class Toyota implements Location
{
	double[] location;
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota (String l)
	{
		location = new double[2];
		String[] locs = l.split(",");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);		
	}
	
	public getID()
	{
		
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public getLoc()
	{
		
	}
	
	
}