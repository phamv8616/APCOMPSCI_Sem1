import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 interest = new Ex_03();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input interest rate:");
		double rate = keyboard.nextDouble();
		System.out.println("Input principal (the original amount you intend to borrow)");
		double principal = keyboard.nextDouble();
		System.out.println("Input number of times the load is compounded per year:");
		double number = keyboard.nextDouble();
		System.out.println("Input life of the loan (in years)");
		double time = keyboard.nextDouble();
		
		System.out.println("Your monthly payment will be " + interest.payment(rate, principal, number, time));
	}
	
	public double payment(double rate, double principal, double number, double time)
	{
		return (principal*(Math.pow(1+(rate/number)), number*time))/(time*12);
	}
	
	
}