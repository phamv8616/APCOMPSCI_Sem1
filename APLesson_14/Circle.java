public class Circle implements CutShapes
{
	private Circle ()
	{
		radius = 0;
	}
	
	public Circle (double r)
	{
		radius = r;
	}
	
	public double getRadius ()
	{
		return radius;
	}
}