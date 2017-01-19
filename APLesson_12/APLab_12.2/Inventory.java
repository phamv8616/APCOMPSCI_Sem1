public class Inventory 
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private int price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price 0;
	}
	
	public Inventory (String m, String n)
	{
		manufacturer = m;
		name = n;
	}
	
	public Inventory (String m, String n, String c, int p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
	}
}