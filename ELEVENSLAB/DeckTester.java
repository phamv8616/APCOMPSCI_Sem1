/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rankv = new String[52];
		String[] suitv = {"Clubs", "Spades", "Diamonds", "Hearts"};
		int[] pointValuev = new int[52];
		for(int v = 0; v<52; v++){
			String rank = "";
			String suit = "";
			if((v+1) %13 ==11) {
				rank = "Jack";
			}
			
			else if((v+1)%13 ==12){
				rank = "Queen";
			}
			
			else if((v+1)%13 ==0){
				rank = "King";
			}
			
			else{
				rank = Integer.toString((v+1)%13);
			}
			rankv[v] = rank;
			pointValuev[v] = ((v+1)%13);
		}
		
		Deck d = new  Deck(rankv, suitv, pointValuev);
		d.deal();
		System.out.println(d);
	}
}
