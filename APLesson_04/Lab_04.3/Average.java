import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first data value");
		double num1 = keyboard.nextDouble();
		System.out.println("Enter your second data value");
		double num2 = keyboard.nextDouble();
		System.out.println("Enter your third data value");
		double num3 = keyboard.nextDouble();
		
		print(average(num1, num2, num3));
	}
	
	public static double average (double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void print(double average)
	{
		System.out.printf("The average is %3.5f\n .", average);
	}
}