import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList;
		
		public ToyStore()
		{		
			ArrayList<Toy> toyList = new ArrayList<Toy>();
		}
		
		public ToyStore(String ts)
		{
			ArrayList<Toy> toyList = new ArrayList<Toy>();	
			loadToys(ts);
		}
		
		public void loadToys (String ts)
		{
			String [] toys = ts.split(", ");
			for ( int i = 0; toys.size; i++)
			{
				
				if (getThatToy(toys[i]).equals(null))
				{
					if (Toy.getType().equals("Car"))
					{
						toyList.add(new Car(toys[i]));
					}
					
					if (toys.getType().equals("AF"))
					{
						toyList.add(new AFigure(toys[i]));
					}
					else
					{
						toy.setCount();
					}
				}
			}
		}
		
		public String getThatToy (String nm)
		{
			for( Toy toy: toyList)
			{
				if (Toy.getName().equals(nm))
				{
					return Toy;
				}
			}
			
			return null;
		}
		
		public String getMostFrequentToy()
		{
			String name = "";
			int max = Integer.MIN_VALUE;
			for( Toy toy : toyList)
			{
				if (max < Toy.getCount())
				{
					max = Toy.getCount();
					name = Toy.getName();
				}
			}
			return name;
		}
		
		public String getMostFrequentType()
		{
			int cars = 0;
			int figures = 0;
			
			for (Toy toy : toyList)
			{
				if(toy.getType().equals("Car"))
				{
					cars++;
				}
				if(toy.getType().equals("AF"))
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