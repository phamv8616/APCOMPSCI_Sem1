import java.util.Scanner;
public class Ex_2
{
	public static void main(String[]args)
	{
		Ex_2 form = new Ex_2();
		
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
		form.format(star, fc1, sc1, star);
		form.format(star, fc2, sc2, star);
		form.format(star, fc3, sc3, star);
		System.out.println("***********************************");
	}
	
	public void format( String star, String fc, String sc);
	{
		System.out.printf("\n %1s %20s %20s %1s", star, fc, sc, star);
	}
	
}