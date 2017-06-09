import java.util.*;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));


       double[] home = {0, 0};

       String printout = "\n\n" +
       "==========================" + " \n Starting Locations..\n";
	   for(Location l : locate){
	   printout += "\nlocation for " + l.getID() + ":" + getLocation(l.getLoc());
	   }
	   
	   printout += "\n" + "==========================";

	   
	  

       for (Location l : locate)
       {
    	   double xMove = Math.round(((Math.random()*100) + 1) * 100.00)/100.00;
    	   double yMove = Math.round(((Math.random()*100) + 1) * 100.00)/100.00;
    	   printout += "\nAfter " + l.getID() + " Moved from (" +getLocation(l.getLoc()) + ")";
    	   l.move(xMove, 2*yMove);
    	   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n\n";
       }


       printout += "\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           printout += "\n\tto " + l.getID() + ": (" + Math.round((getDistance(l.getLoc(), home)*100.00))/100.00 + ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}