import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a mathematical expression: ");
		String expression = keyboard.nextLine();
		
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(expression));
		System.out.println(doEquation(equation));		
	}
	
	public static String doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i<equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				}
				else
				{	
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));					
				}
				equation.remove(i-1);
				equation.remove(i);			
			}
		}
		i++;
		
		i = 0;
		while(i<equation.size())
		{
			if(equation.get(i).equals("+" )|| equation.get(i).equals("-"))
			{
				if(equation.get(i)== "+")
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));					
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			i++;
		}
		return equation;
	}
}