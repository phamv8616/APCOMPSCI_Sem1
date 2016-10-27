import java.util.Scanner;
public class adventure
{
	static Scanner keyboard;
	public static void main(String[]args)
	{
		keyboard = new Scanner (System.in);
		framework();
		
	}
	
	public static void framework()
	{
		System.out.println("A young man arrrives in Hawaii for vacation, but he has difficulty" +
							"\nwith deciding where he should go. His friends help him decide where" +
							"\nto go through the process of elminiation." +
							"\nShould he eat or go to the beach first?"+
							"\n1. Eat" +
							"\n2. Go to the beach");
		int choice1 = keyboard.nextInt();
		
		if(choice1==1)
		{
			System.out.println("He went to a nearby restaurant and finished his meal off with"+
								"\nsome shaved ice.");
			System.out.println("Afterwards, he had trouble deciding if he wanted to watch a" +
								"\nmovie or go shopping for new clothes.");
			System.out.println("Should he watch a movie or go shopping?"+
								"\n1.Watch a movie"+
								"\n2.Go shopping");
				int choice2 = keyboard.nextInt();
				if(choice2==1)
				{
System.out.println("He went to the movie theater and was deciding bewtween"+
										"\na comedy or an action movie"+
										"\nShould he watch a comedy or action movie?"+
										"\n1. Comedy"+
										"\n2. Action");
										int choice3 = keyboard.nextInt();
										if (choice3==1)
											System.out.println("He watched a comedy.AAAAHAHAHAH");
										else 
											System.out.println("He watched an action movie. Yay");					
				}

				else
				{
					System.out.println("He went shopping for a new jacket. Should he buy a blue"+
										"\nor red jacket?"+
										"\n1.Blue"+
										"\n2.Red");
										int choice4 = keyboard.nextInt();
										if (choice4==1)
											System.out.println("He bought a blue jacket.");
										else
											System.out.println("He bought a red jacket.");
				}
		}
		else
		{
			System.out.println("He immediately went to the beach and swam alongside turtles :) :) :)");
			System.out.println("He them proceeded to go back to his hotel to shower. Afterwards he felt" +
								"\na bit hungry and had trouble deciding where to go for dinner."+
								"\nShould he go to a local restaurant or in-n-out?"+
								"\n1.Local Restaurant"+
								"\n2.In-n-Out");
								int choice5 = keyboard.nextInt();
								if (choice5==1)
								{
									System.out.println("He went to a local restaurant and ate Hawaiian food."+
														"\nShould he order spam musubi or a poke bowl?"+
														"\n1.Spam musubi"+
														"\n2.Poke bowl");
														int choice6 = keyboard.nextInt();
														if (choice6==1)
														{
															System.out.println("He didn't feel that hungry and settled for the spam musubi. YUM");	
														}
														else
														{
															System.out.println("He came to Hawaii to eat authenic poke. So he ordered poke.");			
														}
																				
								}
								else
								{
									System.out.println("He went to In-n-Out."+
														"\nShould he order combo meal #1 or #2?");
														int choice7 = keyboard.nextInt();
														if (choice7==1)
														{
															System.out.println("He ordered combo meal #1");	
														}
														else
														{
															System.out.println("He ordered combo meal #2");			
														}								
								}
		}

	}
}								
