import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		// Scanner keyboard = new Scanner(System.in);
		// System.out.println("Please enter word#1");
		// String word1 = keyboard.nextLine();
		// System.out.println("Please enter word#2");
		// String word2 = keyboard.nextLine();	
		// System.out.println("Please enter word#3");
		// String word3 = keyboard.nextLine();
		// makeCenter(word1);
		// makeCenter(word2);
		// makeCenter(word3);
		String word = "POTATO";
	}
	public static String makeCenter(String word)
	{
		if (word.length()>=20)
		{
			return word;			
		}
		else
			return makeCenter(" " + word + " ");
		
	}
}