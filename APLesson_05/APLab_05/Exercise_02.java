import java.util.Scanner;
public class Exercise_02
{
	public static void main(String[]args)
	{
		Exercise_02 form = new Exercise_02();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your first item");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price for your first item");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter your second item");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price for your second item");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Plese enter your third item");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price for your third item");
		double price3 = keyboard.nextDouble();
		
		keyboard.nextLine();
				
		System.out.println("Please enter your fourth item");
		String item4 = keyboard.nextLine();
		System.out.println("Please enter the price for your fourth item");
		double price4 = keyboard.nextDouble();
		
		String sub = "Subtotal";
		String tot = "Total";
		double subtotal = price1 + price2 +price3 + price4;
		double discount = calcdiscount(subtotal);
		double tax = subtotal*.08;
		double total = subtotal-discount+tax;

		System.out.println("<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>");
		form.format(item1,price1);
		form.format(item2,price2);
		form.format(item3,price3);
		form.format(item4,price4);
		System.out.println("");
		form.format(sub, subtotal);
		form.format(tot, total);
		System.out.println("\n___________________________________");
		System.out.println("*    Thank you for your support     *");
	}
	
	public static double calcdiscount (double subtotal)
	{
		double discount = 0.0;
		if(subtotal>=2000)
			return subtotal*0.15;
		return 0.0;
	}
	
		public static void format(String item, double price)
	{
		System.out.printf("\n* %10s.......... %3.2f",item, price);
	}
}