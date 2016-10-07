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

		String dots = "..............";
		
		String star = "*";
		
		String item5 = "Subtotal";
		double price5 = price1 +price2 +price3 +price4;
		
		String item6 = "Tax";
		double price6 = .075*price5;
		
		String item7 = "Total";
		//double price7 = 
		
		System.out.println("<<<<<<<<<<<<< Receipt >>>>>>>>>>>>>>>>");
		form.format(star, item1, dots, price1);
		form.format(star, item2, dots, price2);  		
		form.format(star, item3, dots, price3);
		form.format(star, item4, dots, price4);
		System.out.println("");
		form.format(star, item5, dots, price5);
		form.format(star, item6, dots, price6);
		System.out.println("\n___________________________________");
		System.out.println("*    Thank you for your support     *");
		
	}
	
	public void format(String star, String item, String dots, double price)
	{
		System.out.printf("\n%1s %10s %8s %7.2f",star, item, dots, price);
	}
	
	//public static double discount (double price5, double price7)
	//{
		//if(price5>=2000)
		//{
			//return .85*price5;
		//}
		
		//if(price5<2000)
		//{
			//return price5;
		//}
	//}
}