import java.util.Scanner;
public class reversenumber
{
	static int num;
	static int number;
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number");
		number = keyboard.nextInt();
		num = number;
		getReverse();
	}
	public static void getReverse()
	{
		while(num>0)
		{
			rev*=10;
			rev += (num%10);
			num/=10;
		}
		System.out.println(number + " reversed is " +rev);
	}
}