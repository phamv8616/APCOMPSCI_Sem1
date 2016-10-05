import java.util.Scanner;
public class Modulus
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter the second number");
		int num2 = keyboard.nextInt();
		
		boolean even = (num1+num2)%2==0;
	
		if (even)
		{
			System.out.println("Your number" + (num1 + num2) +" is even!");
		}
	
		if(!even)
		{
			System.out.println("Your number " + (num1 + num2) +" is odd!");
		}
	}
}