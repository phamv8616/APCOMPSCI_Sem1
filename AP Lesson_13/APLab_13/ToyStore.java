import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public static void main(String[]args)
	{
		
		public ToyStore()
		{		
		}
		
		public ToyStore()
		{
		}
		
		public void loadToys(ArrayList <Toy> ts)
		{
			String [] toys = ts.split(", ");
			for ( int = 0; toys.size(); i++)
			{
				String name = toys[i];
				String type = toys[i+1];
				if (return = null)
				{
					toyList.add(new Toy()
				}
			}
		}
		
		public  getThatToy(String nm)
		{
			for( toy: toyList)
			{
				if (name == nm)
				{
					return toy;
				}
			}
			return null;
		}
		
		public getMostFrequentToy()
		{
			String name = "";
			int max = Integer.MIN_VALUE
			for( toy : toyList)
			{
				if (max < //countofthetoy)
					
			}
			return name;
		}
		
		public getMostFrequentType()
		{
			int cars = 0;
			int figures = 0;
			
			for (toy : toyList)
			{
				if()
				{
					cars++;
				}
				if()
				{
					figures++;
				}
			}
			
			if ( cars > figures)
			{
				return "Cars";
			}
			
			if( figures > cars)
			{
				return "Action Figures";
			}
			
			else
			{
				return "Equal amounts of action figures and cars!";
			}
		}
		
		public String toString()
		{
			return toyList;
		}
		
	}
}