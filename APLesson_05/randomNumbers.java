public class randomNumbers
{
	public static void main(String[]args)
	{
		randomNumbers rand = new randomNumbers();
		int num = rand.nextInt(100)+1;
		System.out.println(num);
	}
}