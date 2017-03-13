public class Toyota extends Car
{
	private double[] location = new double[2];

	public Toyota()
	{
		
	}
	
	public Toyota(String c)
	{
		String[] coordinates = c.split(",");
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
	}
}