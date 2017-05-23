/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card Test1 = new Card ("Diamond", "King", 13);
		Card Test2 = new Card ("Spade", "3", 3);
		Card Test3 = new Card ("Hearts", "5", 5);
		Card Test4 = new Card ("Clubs", "7", 7);
		
		System.out.println(Test1);
		System.out.println(Test2);
		System.out.println(Test3);
		System.out.println(Test4);
		System.out.println();
		System.out.println("Testing to see if rank, suit, and point value are equal among 2 different cards \n");
		System.out.println("Test1 and Test2:");
		System.out.println(Test1.matches(Test2));
		
	}
}
