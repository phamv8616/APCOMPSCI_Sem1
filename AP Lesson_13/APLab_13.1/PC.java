public abstract class PC extends GameSystem
{
	private String device;
	public PC()
	{
		super();
		device = "";
	}
	
	public PC(String p, String d)
	{
		super(p);
		device = d;
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public abstract String getPlatform();
	
	public abstract String getDevice();
	
	public String toString()
	{
		return "Platform: [" + platform + "]" + 
				"Serial# : [" + serialNo + "]" +
				"System Input: [" + device + "]";
	}	
}