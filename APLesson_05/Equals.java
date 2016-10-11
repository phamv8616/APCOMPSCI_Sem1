import java.util.Scanner;
public class Equals
{
	public static void main(String[]args)
	{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter a word: ");
			String word1 = keyboard.next();
			String word2 = keyboard.next();
			
			if (word1.equals(word2))
				System.out.println("Words are equal!");
			else 
				System.out.println("Words are not equal");
	}
}
