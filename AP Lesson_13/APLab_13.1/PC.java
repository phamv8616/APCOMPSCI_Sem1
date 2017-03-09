public class PC extends GameSystem
{
	public String getPlatform()
	{
		return "PC";
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() +
				"Serial# : " + getSerialNo() + 
				"System Input :" + systemInput();
	}

}
