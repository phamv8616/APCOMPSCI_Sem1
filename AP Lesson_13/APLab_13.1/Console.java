public abstract class Console extends GameSystem
{

	public Console() 
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public String toString()
	{
		return "Platform: " + getPlatform() + 
				"Serial#: " + getSerial() +
				"Controller: " + getController();
	}

}
