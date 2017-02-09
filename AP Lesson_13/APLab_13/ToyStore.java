import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> ts = new ArrayList<Toy>();
	
	public static void main(String[]args)
	{
		public ToyStore()
		{
			ArrayList<Toy> ts = new ArrayList<Toy>();			
		}
		
		public ToyStore()
		{
			
		}
		
		public void loadToys(ArrayList <Toys> ts)
		{
			//ts.split
			for ( int = 0; toys.size(); i++)
			{
				
			}
		}
		
		public  getThatToy( String nm)
		{
			for( toy : toyList)
			{
				if (name == nm)
				{
					return toy;
				}
			}
			return null
		}
		
		public getMostFrequentToy()
		{
			String name = "";
			int max = Integer.MIN_VALUE
			for( toy : toyList)
			{
				if (max < //countofthetoy)
					
			}
			return
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