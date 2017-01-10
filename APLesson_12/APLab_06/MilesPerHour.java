
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
	
	public MilesPerHour(int d, int h, int min)
	{
		distance = d;
		hours = h;
		minutes = min;
		mph = 0;
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
	
	public double getMPH()
	{
		mph = Math.round(distance/ (hours + minutes/ 60.0));
		return mph;
	}
}