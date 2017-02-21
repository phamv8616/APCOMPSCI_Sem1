public class StudentAdvance extends Advance
{
	public StudentAdvance(){
		super();
	}
	
	public StudentAdvance(int d, int s, int p){
		super(d, s, p);
	}
	
	public double getPrice(){
		price = (price/2);
		return price;
	}
	
	public String toString()
	{
		return "Serial#: " + serialNo +
				"Price: " + price +
				"*****STUDENT ID REQUIRED*****";
	}
}