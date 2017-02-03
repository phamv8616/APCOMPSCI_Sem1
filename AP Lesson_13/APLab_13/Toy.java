public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy(String n, int c)
	{
		name = n;
		count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + count;
	}
}