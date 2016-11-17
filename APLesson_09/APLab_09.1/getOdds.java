public class getOdds
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int [10];
		
		fillArray();
		
		System.out.println("For the following numbers ... ");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;			
		}
	}
	
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.println(arrays);
		}
	}
	
	public static void getOdds()
	{
		
	}
	return odds;
}