import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first name");
		String first = keyboard.nextLine();
		System.out.println("Enter your last name");
		String last = keyboard.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String yesorno = keyboard.nextLine();
		if (yesorno.equals("n"))
		{
			User object = new User("Vyvian", "Pham");
			System.out.println(object);
			System.out.println();
		}
		if (yesorno.equals("y"));
		{
			User object2 = new User("Vyvian", "Pham", "VyvPham");
			System.out.println(object2);
		}
		
	}
	
	// public String toString()
	// {
		// return "Customer Info...\nFirst Name: " + firstName +
								// "\nLast Name: " + lastName +
								// "\nAvatar: " + avatar +
								// "\nUserID#: " + userID;
	// }
}