public class Honda extends Car
{
	private double[] location = new double[2];
	
	public Honda()
	{
		super();
	}
	
	public Honda(double[] loc)
	{
		location[0] = loc[0];
		location[1] = loc[1];
	}
}