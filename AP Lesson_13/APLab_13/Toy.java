public abstract class Toy
{
	public String name;
	public int count;
	
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy(String n)
	{
		name = n;
		count = 1;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setCount(int c)
	{
		count += c;
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
		return "[" + name + count + "]";
	}
}