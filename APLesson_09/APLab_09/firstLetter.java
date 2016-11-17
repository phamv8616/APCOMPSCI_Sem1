import java.util.Scanner;
public class firstLetter
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
		
		first(words);
	}
	
	public static String first(String[]words)
	{
		for( String word : words)
		{
			System.out.println(word.charAt(0));
		}
		return " ";
	}
}