import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("x1: ");
		int x1 = keyboard.nextInt();
		
		System.out.println("y1: ");
		int y1 = keyboard.nextInt();
		
		System.out.println("x2: ");
		int x2 = keyboard.nextInt();
		
		System.out.println("y2: ");
		int y2 = keyboard.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.println("<<<<<<<<<<<< INFO >>>>>>>>>>>>");
		System.out.println("Point 1: " + x1 + ", " + y1);
		System.out.println("Point 1: " + x2 + ", " + y2);
		Systme.out.println("Distance: " + object.getDistance());
		
		object.setx1(10);
		object.sety1(12);
		object.setx2(5);
		object.sety2(6);
		System.out.println("<<<<<<<<<<<< INFO >>>>>>>>>>>>");
		System.out.println("Point 1: " + x1 + ", " + y1);
		System.out.println("Point 1: " + x2 + ", " + y2);
		System.out.println("Distance: " + object.getDistance());
		
		
		
	}
}