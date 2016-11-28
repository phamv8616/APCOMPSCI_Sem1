public class biggestNumber
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int [10];
		fillArray(numbers);
		System.out.println("For the following numbers... " + printArray(numbers));
		System.out.println("The biggest number is... " + getBiggest(numbers));
	}
	
	public static int fillArray(int[]n)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
		return 0;
	}
	
	public static int printArray(int[]n)
	{
		for(int num : n)
		{
			System.out.println(num);
		}
		return 0;
	}
	
	public static int getBiggest(int[]n)
	{
		int max = 0;
		for (int number : n)
		{
			if (number > max)
			{
				max = number;
			}
			return max;
		}
		return 0;
	}
}