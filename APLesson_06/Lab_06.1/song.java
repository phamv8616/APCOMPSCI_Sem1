
public class song
{	
	public static void main(String[]args)
	{
		String word1 = " Na ";
		String word2 = " Hey ";
		String word3 = " Goodbye! ";
		String n = "\n";
		int num1 = 4;
		int num2 = 3;
		int num3 = 1;
		sing(word1, num1, n);
		sing(word1, num1, n);
		sing(word2, num2, n);
		sing(word3, num3, n);
	}
	public static void sing (String word, int num, String n)
	{
		for (int i = 1; i<=num; i++)
		{
			System.out.print(word);
		}
	}

}