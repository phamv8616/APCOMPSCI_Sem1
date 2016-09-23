import java.util.Scanner;
public class SubwooferBoxes
{
	public static void main(String[]args)
	{
		SubwooferBoxes calc = new SubwooferBoxes();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input height in inches:");
		double h = keyboard.nextDouble();
		System.out.println("Input length in inches:");
		double l = keyboard.nextDouble();
		System.out.println("Input width in inches:");
		double w = keyboard.nextDouble();
		
		double vol = calc.calcVol (double h, double l, double w);
		
		System.out.printf("Your calcualted volume in cubic feet is: %10.2f\n ", vol);
		
	}
	
	public double calcVol (double h, double l, double w)
	{
		
		return ((l*w*h)*.00057870);
	}
}
