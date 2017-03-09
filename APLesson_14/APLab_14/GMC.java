public class GMC implements Location
{
	private double x;
	private double y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double xx, double yy)
	{
		x = xx;
		y = yy;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000);
	}
	
	public void move(double xmove, double ymove)
	{
		x += xmove;
		y += ymove;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}
