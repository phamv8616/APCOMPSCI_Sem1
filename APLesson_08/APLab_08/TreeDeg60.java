import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = keyboard.nextLine();
		int stop = word.length();
		int start = 
	}
	public static String tree(String word, int start, int stop)
	{
		if (start<=stop)
		{
			sentence.substring(0,start);
			start ++;
			tree(word, start, stop);
			
		}
		else
			return " ";
	}
}