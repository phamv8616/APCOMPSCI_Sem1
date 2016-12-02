public class getOdds
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int [10];
		
		fillArray(numbers);
		
		System.out.println("For the following numbers:");
		printArray(numbers);
		System.out.println("The ");
		getOdds(numbers);
		System.out.println("are odd numbers.");
		

	}
	
	public static void fillArray(int[] n)
	{
		for(int i = 0; i<numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;			
		}
	}
	
	public static void printArray(int[] n)
	{
		for(int number : numbers)
		{
			System.out.println(number);
		}
		
	}
	
	public static String getOdds(int[] n)
	{
		String odds = " ";
		for( int number : numbers)
		{
			if(number%2 != 0)
			number += odds;
		}
		return odds;
	}
}