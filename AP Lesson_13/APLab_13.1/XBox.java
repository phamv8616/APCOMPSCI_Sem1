public class XBox extends Console
{
	public XBox()
	{
		super();
	}
	
	public XBox(String p, String c)
	{
		super(p,c);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
}