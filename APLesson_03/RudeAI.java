import java.util.Scanner;
public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		
		String name = keyboard.nextLine();	
		System.out.println(name +"??? Why would anyone name a baby that? ");
		System.out.println("How old are you, " +name +"?");
		
		int age = keyboard.nextInt();
		System.out.println("Ooooooooh!!! " +age +" is getting up there.");
		System.out.println("What do you do for fun, " +name +"?");
		
		keyboard.nextLine();
		
		String fun = keyboard.nextLine();
		System.out.println("I thought only nerds like to " +fun);
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.nextLine();
		System.out.println("Boooo! I wouldn't wish the sounds of " +music +" on my worst enemy.");
		System.out.println("How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		System.out.println(siblings +"? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		
		keyboard.nextLine();
		
		String profession = keyboard.nextLine();
		System.out.println("I think you'd have to be smarter to be a " +profession +".");
	
		System.out.println("So " +name +", you're " +age +"...");
		System.out.println("You like to " +fun +" and listen to " +music +"...");
		System.out.println("Good luck becoming a " +profession +".");
		System.out.println("I'm only kiddin' " +name +".");	
	}
}