import java.util.Scanner;
public class password
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter the Username ");
		String user = keyboard.nextLine();
		System.out.println("Please enter the password");
		String pass = keyboard.nextLine();
		
		if (user.equals ("tphs") && pass.equals ("12345"))
			System.out.println("You are granted access!");
		else
			if (user.equals ("tphs"))
				System.out.println("Your password is incorrect!");
			else if (user.equals ("12345"))
				System.out.println("Your username is incorrect!");
			else 
				System.out.println("Your username and password are incorrect.");			
	}
}