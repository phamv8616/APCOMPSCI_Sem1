import java.util.Scanner;
public class BMI
{
	static double height;
	static double weight;
	static double bmi;
	static String condition;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches");
		height = keyboard.nextDouble();
		System.out.println("Please enter your weight in pounds");
		weight = keyboard.nextDouble();
		
		bmi = (weight/(height*height))*703;
		
		calcCondish();
		
		System.out.printf("\nYour BMI is: %.1f" ,bmi);
		System.out.println("\nYou are " +condition);
	}
	
	public static void calcCondish()
	{
		if(bmi<18.5)
			condition = "Underweight.";
		else if(bmi<24.9)
			condition = "Normal.";
		else if(bmi<29.9)
			condition= "Overweight.";
		else if(bmi<34.9)
			condition = "Very Obese.";
		else 
			condition = "Morbidly Obese.";			

	}
	
}