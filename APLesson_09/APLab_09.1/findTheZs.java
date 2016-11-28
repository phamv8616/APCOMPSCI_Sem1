import java.util.Scanner;
public class findTheZs
{
	static String [] words; 
	public static void main(String[]args)
	{
		words = new String [5];
		fillArray();
		System.out.println("For the words " +printArray(word[i]) +"...");
		System.out.println("Only " + hasZs(word[i]) + " contain(s) the letter z");
	}
	
	public static fillArray()
	{
		System.out.println("Please enter 5 words: ");
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
	}
	
	public static printArray()
	{
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	
	public static hasZs()
	{
		String zs = "zs";
		for(String word : words)
		{
			if (word.indexOf("z")>=0)
			{
				System.out.println(word);
			}
		}
	}
}