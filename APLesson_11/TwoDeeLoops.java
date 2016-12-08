public class TwoDeeLoops
{
	public static void main(String[]args)
	{
		//filling the array		
		int[][] values = new int[4][4];
		
		int num = 1;
		
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[j][i] = num;
				num++;
			}
		}
		
		// int num = 1;
		// for(int i = 0; i < values.length; i++)
		// {
			// for (int j = 0; j < values[i].length; j++)
			// {
				// values[i][j] = num;
			// }
			// num++;
		// }

		
		//print out the array
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				System.out.println(values[i][j]);
			}
			System.out.println();		
		}
	}
}