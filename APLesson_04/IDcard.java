import java.util.Scanner;
public class IDcard
{
	public static void main(String[]args)
	{
		IDcard form = new IDcard();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String fc2 = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String sc2 = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String fc3 = keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		String fc1 = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String sc1 = keyboard.nextLine();
		
		System.out.println("What is your subject?");
		String sc3 = keyboard.nextLine();
			
		String star = "*";
		
		System.out.println("***********************************");
		form.format(fc1, sc1);
		form.format(fc2, sc2);
		form.format(fc3, sc3);
		System.out.println("***********************************");
	}
	
	public void format (String fc, String sc)
	{
		System.out.printf("%10s %10s\n", fc, sc);
	}
	
}