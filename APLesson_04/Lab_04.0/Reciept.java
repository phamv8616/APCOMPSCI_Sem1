import java.util.Scanner;
public class Reciept
{
	public static void main(String[]args)
	{
		Reciept form = new Reciept();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
	
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
	
		String star = "*";
		String dots = "........";
		
		String item4 = "Subtotal:";
		double price4 = price1 + price2 + price3;
		
		String item5 = "Tax:";
		double price5 = 0.63;
		
		String item6 = "Total:";
		double price6 = price4 + price5;
	
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(star, item1, dots, price1);
		form.format(star, item2, dots, price2);
		form.format(star, item3, dots, price3);	
		System.out.println("");
		System.out.println("");
		form.format(star, item4, dots, price4);
		form.format(star,item5, dots, price5);
		form.format(star, item6, dots, price6);
		System.out.println("\n_________________________________________");
		System.out.println(" * Thank you for your support * ");
	}
	
	public void format(String star, String item, String dots, double price)
	{
		System.out.printf("\n%1s %20s %8s %5.2f", star, item, dots, price);
	}
	
}