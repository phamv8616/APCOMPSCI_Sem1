public abstract class Console extends GameSystem
{
	public String controller;
	
	public Console()
	{
		super();
		controller = "";
	}
	
	public Console(String p, String c)
	{
		super(p);
		controller = c;
	}
	
	public abstract String getController();
	
	public abstract String getPlatform();
	
	public String toString()
	{
		return "Platform: [" + platform + "]" + 
				"Serial# : [" + serialNo + "]" +
				"Controller: [" + controller + "]";
	}
	
}