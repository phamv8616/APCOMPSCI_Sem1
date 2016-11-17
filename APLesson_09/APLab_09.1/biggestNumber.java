public class biggestNumber
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int [10];
		fillArray();
		System.out.println("For the following numbers ... " + printArray()+
		"The biggest number is " + getBiggest());
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.println(num);
		}
	}
	
	public static void getBiggest()
	{
		int max;
		for (int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
			return max;
		}
	}
}