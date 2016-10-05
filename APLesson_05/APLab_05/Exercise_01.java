public class Exercise_01
{
	public static void main(String[]args)
	{
		Exercise_01 rand = new Exercise_01();
		
		int player = rand.nextInt(6)+1;
		int computer = rand.nextInt(6)+1;
		
		winner = rollDice();
		
		System.out.println("You rolled a" +player);
		System.out.println("The computer rolled a" +computer);
		System.out.println("The winner is" +winner);
	}
	
	public static int rollDice(int player, int computer)
	{
		if(player>computer)
		{
			player==winner;
		}
		
		if(computer>player)
		{
			computer==winner;
		}
		
		return winner;
		
	}
	
	
}