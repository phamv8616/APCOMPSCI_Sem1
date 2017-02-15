import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore 
{

	private ArrayList<Toy> toyList;
	

	public ToyStore() 
	{
		toyList = new ArrayList<Toy>();
	}

	public ToyStore(String ts) 
	{
		toyList = new ArrayList<Toy>();
		loadToys(ts);

	}
	public void loadToys (String ts) 
	{
		String toys[] = ts.split(", ");
		for (int i = 0; i <= toys.length-2; i+=2) 
		{
			String name = toys[i];
			String type = toys[i+1];
			
			if (getThatToy(toys[i]) == null) 
			{
				if (toys[i+1].equals("Car")) 
				{
					toyList.add(new Car(toys[i]));
				}
				else if (toys[i+1].equals("AF")) 
				{
					toyList.add(new AFigure(toys[i]));
				}
			}
			else 
			{
				for (Toy toy: toyList) {
					if (toy.getName().equals(toys[i])) 
					{
						toy.setCount(1);
					}
				}
			}
		}
	}
	public Toy getThatToy(String nm)	
	{
		for (Toy toy: toyList) 
		{
			if (toy.getName().equals(nm)) 
			{
				return toy;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy() 
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy toy: toyList) 
		{
			if (max < toy.getCount()) 
			{
				name = toy.getName();
				max = toy.getCount();
			}
		}
		return name;
	}
	
	public String getMostFrequentType() 
	{
		int cars = 0;
		int figures = 0;
		for (Toy toy: toyList) 
		{
			if ((toy.getClass() + "").equals("class Car")) 
			{
				cars++;
			}
			else if ((toy.getClass() + "").equals("class AFigure")) 
			{
				figures++;
			}
		}
		if (cars > figures) 
		{
			return "Cars";
		}
		else if (figures > cars) 
		{
			return "Action Figures";
		}
		return "Equal amounts of action figures and cars!";
	}
	
	public String toString() 
	{
		String list = "[";
		for (int i = 0; i < toyList.size(); i++) 
		{
			list += toyList.get(i).getName() + " " + toyList.get(i).getCount();
			if (i != toyList.size()-1) {
				list += ", ";
			}
		}
		list += "]";
		return list;
	}
}
