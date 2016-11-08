
public class song
{	
	public static void main(String[]args)
	{
		String word1 = " Na ";
		String word2 = " Hey ";
		String word3 = " Goodbye! ";
		int num1 = 4;
		int num2 = 3;
		int num3 = 1;
		String next = "\n";
		sing(word1, num1, next);
		sing(word1, num1, next);
		sing(word2, num2, next);
		sing(word3, num3, next);
	}
	public static void sing (String word, int num)
	{
		for (int i = 1; i<=num; i++)
		{
			System.out.print(word);
		}
	}

}