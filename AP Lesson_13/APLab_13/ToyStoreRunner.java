public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore object = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");	
		System.out.println(object);
		System.out.println("The most frequent toy is: " + object.getMostFrequentToy());
		System.out.println("The most frequent type: " + object.getMostFrequentType());
	}
}