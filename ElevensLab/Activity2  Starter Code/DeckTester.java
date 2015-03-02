/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
	    String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red", "black"};
		int[] pointValues = {11, 12, 13};
		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deck2 = new Deck(ranks, suits, pointValues);
		Deck deck3 = new Deck(ranks, suits, pointValues);
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.toString());
	}
}
