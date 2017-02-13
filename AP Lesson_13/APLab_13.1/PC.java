public class PC extends Game System
{
	public PC()
	{
		super();
	}
	
	public PC()
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: [" + platform + "]" + 
				"Serial# : [" + serialNo + "]" +
				"System Input: [" + device + "]";
	}	
}