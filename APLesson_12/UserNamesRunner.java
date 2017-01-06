public class UserNamesRunner
{
	public static void main(String[]args)
	{
		UserNames object = new UserNames("Vyvpham", "Vyvian", "Pham");
		
		System.out.println("<<<<<<<<<< USER INFO >>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
		
		// UserNames object1 = new UserNames();		
		
		object.setUserName("phamvyvian");
		System.out.println("\n<<<<<<<<<< USER INFO >>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("User Name: " + object.getUserName());			
		
	}
}