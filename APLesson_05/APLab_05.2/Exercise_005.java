import java.util.Scanner;
public class Exercise_005
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Is the main character a boy or a girl? Pick number 1 or 2." +
							"\n 1.Boy" +
							"\n 2.Girl");
		int bOg = keyboard.nextInt();
		if(bOg==1 || bOg==2)
		{
			if(bOg==1)
			{
				System.out.println("Once upon a time there was a boy.");
			}
			else
			{
				System.out.println("Once Upon a time there was a girl.");
			}
				
		}
		
		else
		{

			
		}
		
		
	}
}