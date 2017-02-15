public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String p, String c)
	{
		super(p, c);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public abstract String getPlatform();
	
	public String toString()
	{
		return "Platform: [" + platform + "]" + 
				"Serial# : [" + serialNo + "]" +
				"System Input: [" + device + "]";
	}	
}