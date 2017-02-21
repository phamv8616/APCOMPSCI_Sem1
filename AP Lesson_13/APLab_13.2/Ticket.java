public class Ticket
{
	public int serialNo;
	public double price;

	public Ticket()
	{
		serialNo = (int)(Math.random()*1000000);
		price = 0;
	}
	
	public Ticket(int s, double p)
	{
		serialNo = s;
		price = p;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial#: " + serialNo +
				"Price: " + price;
	}
	
}