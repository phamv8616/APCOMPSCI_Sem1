public class PC extends GameSystem
{
	public String getPlatform()
	{
		return "PC";
	}
	
	public String systemInput()
	{
		return " Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "\nPlatform: " + getPlatform() +
				"\nSerial# : " + getSerialNo() + 
				"\nSystem Input :" + systemInput();
	}

}
