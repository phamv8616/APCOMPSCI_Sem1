import java.util.Scanner;
public class Cube
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the side length");
		double side = keyboard.nextDouble();
		
		print(calcSurf(double side));
	}
	
	public static double calcSurf(double side)
	{
		return 6*(side*side);
	}
	
	public static void print(double calcSurf)
	{
		System.out.printf("The surface area is %4.5f", calcSurf);
	}
}