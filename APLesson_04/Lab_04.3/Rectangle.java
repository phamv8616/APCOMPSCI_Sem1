import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the length");
		double l = keyboard.nextDouble();
		System.out.println("Enter the width");
		double w = keyboard.nextDouble();
		
		print(calcPerim(l, w));
		
		
	}
	
	public static double calcPerim( double l, double w)
	{
		return 2*(l+w);
	}
	public static void print(double perim)
	{
		System.out.printf("Your rectangle is %3.5f ft around.", perim);
	}
}