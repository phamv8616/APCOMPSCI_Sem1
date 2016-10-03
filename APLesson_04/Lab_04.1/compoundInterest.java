import java.util.Scanner;
public class compoundInterest
{
	public static void main(String[]args)
	{
		compoundInterest interest = new compoundInterest();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input interest rate:");
		double rate = keyboard.nextDouble();
		System.out.println("Input principal (the original amount you intend to borrow)");
		double principal = keyboard.nextDouble();
		System.out.println("Input number of times the load is compounded per year:");
		double number = keyboard.nextDouble();
		System.out.println("Input life of the loan (in years)");
		double time = keyboard.nextDouble();
		
		double total = interest.payment(rate, principal, number, time);
		System.out.printf("Your monthly payment will be %10.2f\n", total);
	}
	
	public double payment(double rate, double principal, double number, double time)
	{
		return (principal*(Math.pow((1+(rate/number)), number*time))) / (time*12);
	}
	
	
}