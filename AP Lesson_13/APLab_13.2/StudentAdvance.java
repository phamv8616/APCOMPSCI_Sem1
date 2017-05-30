public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int n)
	{
		super(n);
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "\nStudent Advance: " + getPrice() +
				" \nStudent Walkup: " + 50/2 +
				"\n*STUDENT ID REQUIRED*";
	}
}
