/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 *
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Diamond", "4", 4);
		Card two = new Card("Heart", "2", 2);
		Card three = new Card("Heart", "2", 2);
		
		System.out.println("Cards 1, 2 do not match - " + !one.matches(two));
		System.out.println("Cards 2 and 3 match - " + two.matches(three));
	}
}
