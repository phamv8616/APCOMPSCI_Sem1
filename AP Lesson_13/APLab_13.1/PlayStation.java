public class PlayStation extends Console
{
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p, String c)
	{
		super(p, c);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}