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
		
		String dots = ".......";
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		form.format(item1, dots, price1);
		form.format(item2, dots, price2);
		form.format(item3, dots, price3);
		form.format(item4, dots, price4);
		
	}
	
	public void format(String item, String dots, double price)
	{
		System.out.printf("%5.2s %5.5f",item ,price);
	}
}