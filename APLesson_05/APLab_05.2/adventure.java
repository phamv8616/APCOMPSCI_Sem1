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
				System.out.println("Afterwards, he wanted to buy a new jacket. Should he buy a" +
									"\nred or blue jacket?");
				System.out.println("1.Red"+
									"\n2.Blue");
									if(choice==1)
										System.out.println("He bought a red jacket.");
									else
										System.out.println("He bought a blue jacket.");
			else
				System.out.println("He immediately went to the beach and swam alongside turtles.");
				System.out.println("He them proceeded to go back to his hotel and order room service"+
									"\nfor dinner. Which of the following should he order for dessert?");
				System.out.println("1.Chocolate cookies"+
									"\n2.Cheesecake"+
									"\n3. All of the above.");
									if(choice==1)
										System.out.println("He ordered chocolate cookies.");
									else if(choice==2)
										System.out.println("He order cheesecake");
									else
										Sytem.out.println("He ordered both");
		else
			System.out.println("Please enter 1 or 2");
			framework();
	}
}								
