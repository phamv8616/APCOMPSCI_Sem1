import java.util.Scanner;
public class BMI
{
	static double height;
	static double weight;
	static double bmi;
	static String condtion;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		height = keyboard.nextDouble();
		System.out.println("Please enter your weight in pounds");
		weight = keyboard.nextDouble();
		
		
		condition = "";
	
		System.out.println("Your BMI is: " +bmi);
		System.out.println("You are " +condition);
	}
}