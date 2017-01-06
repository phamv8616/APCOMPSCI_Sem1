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
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes, mph);
		System.out.println("<<<<<<<<<<< INFO >>>>>>>>>>>");
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH(distance, hours, minutes, mph) + " mph.");
		
		object.setDistance(10);
		object.setHours(2);
		object.setMinutes(20);
		System.out.println("<<<<<<<<<<< INFO >>>>>>>>>>>");
		System.out.println(distance + " miles in " + hours + " hours = " + object.getMPH(distance, hours, minutes, mph) + " mph.");
		

	}
}