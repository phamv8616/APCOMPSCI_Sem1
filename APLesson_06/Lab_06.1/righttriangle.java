import java.util.Scanner;
public class righttriangle
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = keyboard.next();
		
		for( int i = word.length() ; i>=0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}