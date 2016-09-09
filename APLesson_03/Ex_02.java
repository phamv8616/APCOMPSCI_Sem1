import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		int height = keyboard.nextInt(); 
		
		System.out.println("How much do you weigh in pounds?");
		double weight = keyboard.nextDouble();
		
		System.out.println("Your BMI is: " + 703*weight/(height*height));
	}
}
