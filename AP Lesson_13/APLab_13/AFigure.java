public class AFigure extends Toy
{
	private String name;
	private int count;
	
	public AFigure()
	{
		super();
	}
	
	public AFigure(String n, int c)
	{
		super(n, c);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public abstract String getType()
	{
		return "Action figure";
	}
	
	public String toString()
	{
		return "Name: " + name +
				"Count: " + count;				
	}
}