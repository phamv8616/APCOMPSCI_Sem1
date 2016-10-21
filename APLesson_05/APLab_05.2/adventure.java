import java.util.Scanner;
public class adventure
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner (System.in);
		framework();
		
	}
	
	public static void framework()
	{
		System.out.println("A young man arrrives in Hawaii for vacation, but he has difficulty" +
							"\nwith deciding where he should go. His friends help him decide where" +
							"\nto go through the process of elminiation." +
							"\nShould he eat or go to the beach first?"+
							"\n1. Eat" +
							"\n2. Go to the beach");
		int choice1 = keyboard.nextInt();
		int choice = choice1;
		
		if (choice==choice1)
			if (choice==1)
				System.out.println("He went to a nearby restaurant and finished his meal off with"+
									"\nsome shaved ice.");
			else
				System.out.println("He immediately went to the beach and swam alongside turtles.");

	}
}								
