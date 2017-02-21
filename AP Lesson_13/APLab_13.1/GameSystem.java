public class GameSystem
{
	public String platform;
	public int serialNo;
	
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	public GameSystem(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*1000000);
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