public class Inventory 
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Inventory (String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Undefined";
		UPC = (int)(Math.random()*1000000) + 1;
	}
	
	public Inventory (String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		price = p;
		UPC = (int)(Math.random()*1000000) + 1;	
	}
	
	public void setCategory(String c)
	{
		category = c;
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	
	public String toString()
	{
		return "\nProduct Info... \nManufacturer: " + manufacturer +
								"\nName: " + name +
								"\nCategory: " + category +
								"\nUPC#: " + UPC +
								"\nPrice: $" + price;
	}
}