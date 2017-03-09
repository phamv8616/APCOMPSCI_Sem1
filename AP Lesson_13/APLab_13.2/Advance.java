public class Advance extends Ticket
{
	public int daysLeft;
	
	public Advance()
	{
		super();
		daysLeft = 0;
	}
	
	public Advance(int d)
	{
		super();
		daysLeft = d;
	}
	
	public int getDaysLeft()
	{
		return daysLeft;
	}
	
	public int getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}
