public class GameSystem
{
	private String platform;
	private int serialNo;
	
	
	public GameSystem()
	{
		platform = "";
		serialNo = 0;
	}
	public GameSystem(String p)
	{
		platform = p;
		serialNo = ("p" + (int)(Math.random()*100000));
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