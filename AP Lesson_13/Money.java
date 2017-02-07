public abstract class Money
{
	private String name;
	private String value;
	private int count;
	
	public Money()
	{
		this.name = "";
		this.value = "";
		this.count = 0;
	}
	
	public Money(String n, String v)
	{
		this.name = n;
		this.value = v;
		this.count = 0;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public int getcount()
	{
		return count;
	}
	public abstract String scan();
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value + "\n";		
	}
}
