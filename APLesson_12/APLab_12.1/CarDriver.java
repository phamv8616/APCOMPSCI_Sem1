import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Paint Color: " );
		String paint = keyboard.nextLine();
		
		System.out.println("Interior Design: ");
		String interior = keyboard.nextLine();
		
		System.out.println("Engine: ");
		String engine = keyboard.nextLine();
		
		System.out.println("Tires: ");
		String tires = keyboard.nextLine();
		
		Car object = new Car (paint, interior, engine, tires);
		
		System.out.println("\nYour vehicle is ready... ");
		System.out.println("Paint: " + paint);
		System.out.println("Interior: " + interior);
		System.out.println("Engine: " + engine);
		System.out.println("Tires: " + tires);
	}
}