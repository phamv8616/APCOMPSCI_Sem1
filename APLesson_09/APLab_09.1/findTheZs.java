import java.util.Scanner;
public class findTheZs
{
	static String [] words; 
	public static void main(String[]args)
	{
		words = new String [5];
		fillArray(words);
		System.out.println("For all the words: \n");
		printArray(words);
		System.out.println("\nOnly the following contain the letter z" + hasZs(words));
	}
	
	public static void fillArray(String [] words)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
	}
	
	public static void printArray(String [] words)
	{
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	
	public static String hasZs(String [] words)
	{
		String zs = " ";
		for(String word : words)
		{
			if (word.indexOf("z")>=0)
			{
				words + zs;
			}
		}
		return zs;
	}
}