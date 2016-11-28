public class getOdds
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int [10];
		
		fillArray();
		
		System.out.println("For the following numbers ... " + printArray()+
		"The " + getOdds() + "are all odd numbers");

	}
	
	public static int fillArray(int[]n)
	{
		for(int i = 0; i<numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;			
		}
	}
	
	public static int printArray(int[]n)
	{
		for(int number : numbers)
		{
			System.out.println(number);
		}
	}
	
	// public static void getOdds()
	// {
		// int odds;
		// for( int number : numbers)
		// {
			// if()
		// }
	// }
	// return odds;
}