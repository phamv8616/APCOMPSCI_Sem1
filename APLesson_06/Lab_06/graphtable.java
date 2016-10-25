import java.util.Scanner;
public class graphtable
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = keyboard.nextInt();
		System.out.println("Please enter size of the table: ");
		int size = keyboard.nextInt();
		
		for(int i = 0; i<=size; i++)
		{
			System.out.println(i*number);
		}
	}
}