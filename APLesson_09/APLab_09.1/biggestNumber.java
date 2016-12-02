public class biggestNumber
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int [10];
		fillArray(numbers);
		System.out.println("For the following numbers... ");
		printArray(numbers);
		System.out.println("The biggest number is... ");
		getBiggest(numbers);
	}
	
	public static void fillArray(int[] n)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
	}
	
	public static void printArray(int[] n)
	{
		for(int num : numbers)
		{
			System.out.println(num);
		}		
		
	}
	
	public static int getBiggest(int[] n)
	{
		int max = 0;
		for (int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
		}
		return max;
	}
}