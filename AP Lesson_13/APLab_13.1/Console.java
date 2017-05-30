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

	abstract String getController();
	
	public String toString()
	{
		return "\nPlatform: " + getPlatform() + 
				"\nSerial#: " + super.getSerialNo() +
				"\nController: " + getController();
	}

}
