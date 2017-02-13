public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore object = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars," +
										"AF, Pullback, Car, Star Wars, AF");	
		getMostFrequentToy();
		getMostFrequentType();
	}
}