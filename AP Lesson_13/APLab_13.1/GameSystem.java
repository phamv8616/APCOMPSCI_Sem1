public class GameSystem 
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		platform = "";
		serialNo = (int)(Math.random() * 1000000);
	}
	
	public GameSystem(String p)
	{
		platform = p;
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}
