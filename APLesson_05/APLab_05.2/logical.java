import java.util.Scanner;
public class logical
{
	static Scanner keyboard;
	public static void main(String[]args)
	{		
		Scanner keyboard = new Scanner(System.in);
		checkNum();
	}
	
	public static void checkNum()
	{
		System.out.println("Pick a number between 1 and 10");
		int guess = keyboard.nextInt();
		if(guess>=1 && guess<=10)
		{
				System.out.println("Your number is in between 1 and 10!");
		}
		else
		{
			System.out.println("Wrong!");
			checkNum();
		}
	}
}