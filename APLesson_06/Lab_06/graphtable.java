import java.util.Scanner;
public class graphtable
{
	public static void main(String[]args)
	{
		graphtable form = new graphtable();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = keyboard.nextInt();
		System.out.println("Please enter size of the table: ");
		int size = keyboard.nextInt();
		int total;
		for (int i = 1; i<=size; i++)
		{
			form.format(i, total);
		}

	}

	public void format(int i, int num, int total)
	{
		total = i*num;
		System.out.printf("\n%5f\t%5f", i, total);
	}
}
