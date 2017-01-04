import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Ex_01
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		System.out.println(nums);
	}
	
	public static int gFactor(int n)
	{
		for (int v = 2; v <= n; v++)
			if(v%n==0)
			{
				return 1;
			}
			else
				return 0;
	}

	public static void removePrimes(int [] nums)
	{
		for(int i = 0; i <= nums.size(); i++)
			if(gFactor(nums[i])==0)
			{
				nums.remove(nums.indexOf(i));	
				i --;
			}
				
				
	}
}
