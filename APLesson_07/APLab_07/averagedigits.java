import java.util.Scanner;
public class averagedigits
{
	static double digits = 0;
	static double average = 0;
	static int number;
	static int num;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = keyboard.nextInt();
		avDigits();
	}
	public static void avDigits()
	{
		num = number;
		while (num > 0)
		{
			digits ++;			
			average +=(num%10);
			num/=10;
		}
		
		System.out.println("The average of the digits in " +number +" is " + (average/digits));
	}
}