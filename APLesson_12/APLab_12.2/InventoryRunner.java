import java.util.Scanner;
public class InventoryRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the manufacturer: ");
		String manufacturer = keyboard.nextLine();
		
		System.out.println("Please enter the name: ");
		String name = keyboard.nextLine();
		
		Inventory item1 = new Inventory();
		
		System.out.println("Will you be entering category and price information? (y or n)");
		String answer = keyboard.nextLine();
		if (answer.equals("y"))
		{
			System.out.println("Category: ");
			String category = keyboard.nextLine();
			System.out.println("Price: ");
			double price = keyboard.nextDouble();
			item1 = new Inventory(manufacturer, name, category, price);
		}
		if (answer.equals("n"))
		{
			item1 = new Inventory(manufacturer, name);
		}
		
		System.out.println(item1);
	}
}