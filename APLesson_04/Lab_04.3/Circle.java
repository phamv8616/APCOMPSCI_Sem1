import java.util.Scanner;
public class Circle
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle");
		double r = keyboard.nextDouble();
		print(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14*(Math.pow(r,2));
	}
	
	public static void print(double calcArea)
	{
		System.out.printf("The area of the circle is %3.5f", calcArea);
	}
}