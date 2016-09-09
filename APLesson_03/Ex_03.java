import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many cats do you have?");
		int cats = keyboard.nextInt();
		
		System.out.println("How many cats do you want to have?");
		int want = keyboard.nextInt();
		
		System.out.println("This is how many cats you should have:" + (cats+want)/2 +" cats");
	}
}