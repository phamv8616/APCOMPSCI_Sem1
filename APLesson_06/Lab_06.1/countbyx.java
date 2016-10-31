import java.util.Scanner;
public class countbyx
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the maximum number.");
		int maxnum = keyboard.nextInt();
		System.out.println("Please enter the interval that you'd like for it to increase in.");
		int intnum = keyboard.nextInt();
		
		for(int i = 0; i<=maxnum; i+=intnum)
		{
			System.out.println(i);
		}
		
	}
}