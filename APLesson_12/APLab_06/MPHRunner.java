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

		MilesPerHour object1 = new MilesPerHour();	
		 
		distance = 40;
		hours = 2;
		minutes = 2;
		System.out.println("\n<<<<<<<<<<< INFO >>>>>>>>>>>");
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH() + " mph.");
		

	}
}