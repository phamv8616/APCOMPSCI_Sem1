import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the side length of the cube:");
		side = keyboard.nextDouble();
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = (6*(side*side));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with " +side +" sides is %3.5f.", sa);
	}
}