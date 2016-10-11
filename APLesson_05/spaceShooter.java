import java.util.Scanner;

public class spaceShooter
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your target: ");
		int target = keyboard.nextInt();
		int enemyLoc = (int)(Math.random()*3)+1;
		
		if (target == enemyLoc)
			System.out.println("It's a hit!");
		else 
			System.out.println("Keep trying!");
	}
}