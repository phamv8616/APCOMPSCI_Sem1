import java.util.Scanner;
public class Lesson_006
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = keyboard.next();
		
		for(int i=0; i<= word.length(); i++)
		{
			System.out.println(word.substring(0,i));
		}
	}
}