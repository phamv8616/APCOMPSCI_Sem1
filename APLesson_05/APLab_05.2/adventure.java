import java.util.Scanner;
public class adventure
{
	static Scanner keyboard;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		order();
	}
	
	public static void order()
	{
		int choice = keyboard.nextInt();
		System.out.println("Once upon a time there was a young boy named John that went to in-n-out." +
							"\nHe had trouble deciding what he wanted to order because he literally wanted everything there." +
							"\nIt is your task to help John decide what he wants to order from in-n-out.");
		System.out.println("Should John order a combo meal?"+
							"\n1. Yes"+
							"\n2. No");		
		
		if (choice==1 || choice==2)
		{
			if (choice==1)
			{
				System.out.println("When it was John's turn to order, he");
			}
			else
			{
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Please enter 1 or 2");
			order();
		}
	}
}