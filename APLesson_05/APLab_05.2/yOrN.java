import java.util.Scanner;
public class yOrN
{
	static Scanner keyboard;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to do some recursion?");
		String choice = keyboard.next();
		
		if(choice.equals ("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
				System.out.println("Yay! Let's do some recursion.");
			else
				System.out.println("Ew. You've spoiled the fun.");
		}
		else
		{
			System.out.println("Please enter Y or N");
			recursion();
		}

	}
}