public abstract class Toy
{
	//public or private?
	public String name;
	public int count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String n, int c)
	{
		this.name = n;
		this.count = 1;
	}
	
	public abstract String getType();
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String toString()
	{
		return "Name: " + name + 
				"\nCount: " + count + "\n";
	}
}