public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(){
		super();
		daysLeft = 0;
	}
	
	public Advance( int d, int s , double p){
		super(s, p);
		daysLeft = d;
	}
	
	public double getPrice()
	{
		if( daysLeft >= 10 ){
			price = 30.00;
		}
		else{
			price = 40.00;
		}
		
		return price;
	}
	
	
}