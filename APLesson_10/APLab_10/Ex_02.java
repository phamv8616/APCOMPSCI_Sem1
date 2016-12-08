import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String equation = keyboard.nextLine();
		
		ArrayList<String> equation = new ArrayList<String>();
		System.out.println(doEquation(equation));		
	}
	
	public static String doEquation(String[] i)
	{
		while(i<equation.size)
		{
			if(equation.indexOf(i)== "*" || equation.indexOf(i)== "/")
			{
				if(equation.indexOf(i) == "*")
				{
					equation.indexOf(i) = equation.indexOf(i-1)*equation.indexOf(i+1);					
				}
				else
				{
					equation.indexOf(i) = equation.indexof(i-1)/equation.indexOf(i+1);					
				}
				equation.remove(equation.indexOf(i-1));
				equation.remove(equation.indexOf(i));			
			}
		}
		
		while(i<equation.size)
		{
			if(equation.indexOf(i)== "+" || equation.indexOf(i)== "-")
			{
				if(equation.indexOf(i)== "+")
				{
					equation.indexOf(i)= equation.indexOf(i-1) + equation.indexOf(i+1);
				}
				else
				{
					equation.indexOf(i)= equation.indexOf(i-1) - equation.indexOf(i+1);
				}
				equation.remove(equation.indexOf(i-1));
				equation.remove(equation.indexOf(i));
			}
		}
			return equation;
	}
}