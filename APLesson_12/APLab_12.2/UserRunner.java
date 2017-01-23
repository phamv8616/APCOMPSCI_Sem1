import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Please enter your first name: ");
		String firstName = keyboard.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = keyboard.nextLine();
		
		User user1 = new User();

		System.out.println("Would you like to use a public avatar? (y or n)");
		String yesorno = keyboard.nextLine();	
		
		if(yesorno.equals("y"))
		{
			System.out.println("Please enter your avatar name: ");
			String avatar = keyboard.nextLine();
			user1 = new User(firstName,lastName, avatar);
		}
		if(yesorno.equals("n"))
		{
			user1 = new User(firstName, lastName);
		}
		
		System.out.println(user1);
	}
	
}