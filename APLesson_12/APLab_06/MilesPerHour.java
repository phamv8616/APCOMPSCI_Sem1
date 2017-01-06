
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0; 
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int d, int h, int min, double m)
	{
		distance = d;
		hours = h;
		minutes = min;
		mph = m;
	}
	
	public void setDistance(int d)
	{
		distance = d;
	}
	
	public void setHours(int h)
	{
		hours = h;
	}
	
	public void setMinutes(int min)
	{
		minutes = min;
	}
	
	public double getMPH(int distance, int hours, int minutes, double mph)
	{
		mph = Math.round(distance/ (hours + minutes/ 60.0));
		return mph;
	}
}