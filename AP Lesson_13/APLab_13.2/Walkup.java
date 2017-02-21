public class Walkup extends Ticket{
	
	public Walkup(){
		super();
	}
	
	public Walkup( int s, double p){
		super(s, p);
	}
	
	public int getSerial()
	{
		return serialNo;
	}
	
	public double getPrice()
	{
		price = 50.00;
		return price;
	}
}