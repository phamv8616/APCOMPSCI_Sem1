import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		int [][] nums = new int [4][4];
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0 ; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random()*100) + 1;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Please enter a number: ");
		int divisor = keyboard.nextInt();
		
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		
		System.out.println("\nThere are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}