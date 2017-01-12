import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Hair color: ");
		String hair = keyboard.nextLine();
		
		System.out.println("Eye color: ");
		String eyes = keyboard.nextLine();
		
		System.out.println("Skin color: ");
		String skin = keyboard.nextLine();
		
		Human object = new Human (hair, eyes, skin);
		
		System.out.println("<<<<<<<<<<<<<<<< MY INFO >>>>>>>>>>>>>>>");
		System.out.println("\nHair: " + hair);
		System.out.println("Eyes: " + eyes);
		System.out.println("Skin: " + skin);
		
		Human object1 = new Human(hair, eyes, skin);
		object.setHES("Brown", "Brown", "Tan");
		System.out.println("\n<<<<<<<<<<<<<<<< FRIEND'S INFO >>>>>>>>>>>>>>>");
		System.out.println("\nHair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	
	}
}