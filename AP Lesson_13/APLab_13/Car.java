public class Car extends Toy
{
	public Car()
	{
		super();
	}
	
	public Car(String n, int c)
	{
		super(n,c);
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return super.toString();			
	}	
}