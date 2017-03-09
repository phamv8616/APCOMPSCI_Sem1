public abstract class Ticket 
{
	private int serialNo;
	private int price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() *1000000);
		price = 0;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "\nSerial# : " + getSerialNo() +
				"\nPrice : " + getPrice();
	}
}
