public class TwoDee_1
{
	public static void main(String[]args)
	{
		int[][] values = new int[4][4];
		//filling the array
		values[0][0] = 1;
		values[1][1] = 2;
		values[2][2] = 3;
		values[3][3] = 4;
		
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