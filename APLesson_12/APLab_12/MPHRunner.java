import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Distance in miles: ");
		int distance = keyboard.nextInt();
		
		System.out.println("Hours: ");
		int hours = keyboard.nextInt();
		
		System.out.println("Minutes: ");
		int minutes = keyboard.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);		
		
		System.out.println("\n<<<<<<<<<<< INFO >>>>>>>>>>>");
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH() + " mph.");
		 
		object.setValues(12, 4, 16);
		System.out.println("\n<<<<<<<<<<< INFO >>>>>>>>>>>");
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours = " + object.getMPH() + " mph.");
		

	}
}