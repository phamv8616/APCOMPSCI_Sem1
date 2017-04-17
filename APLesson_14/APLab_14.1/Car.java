
public abstract class Car implements Location
{
	private int x;
	private int y;
	private int ID;
	
	public Car()
	{
		x = 0;
		y = 0;
		ID = (int)(Math.random()*999999) + 1;
	}
	
	public void move (double q, double w)
	{
		x += q;
		y += w;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		double[] Loc = new double[2];
		Loc[0] = x;
		Loc[1] = y;
		return Loc;
	}

}
