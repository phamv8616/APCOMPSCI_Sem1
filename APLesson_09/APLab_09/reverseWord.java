import java.util.Scanner;
public class reverseWord
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for( int i = 0; i < words.length; i++)
		{
			words[i] = keyboard.next();
		}
		
		System.out.println("\nIn order...\n");
		
		for (String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println();
		System.out.println("Reversed...");
		
		reverse(words);
	}
	
	public static String reverse(String[] words)
	{
		for( int i = words.length; i > 0; i--)
		{
		System.out.println(words[i]);
		}
		return " ";
	}
}