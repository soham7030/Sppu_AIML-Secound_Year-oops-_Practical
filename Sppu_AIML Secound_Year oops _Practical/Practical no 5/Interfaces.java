/*Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common 
functionalitiessuch as Gear Change, Speed up and apply breaks. Make an interface and put all 
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these 
functionalities in their own class in their own way. */


interface vehicles
{
	public void GearChange();
	public void Speedup();
	public void applyBreaks();
}

 class bicycle implements vehicles
 {
	 public void GearChange() {
	  System.out.println("Gear Change of bicycle");
	  
	 }
	 public void Speedup() {
		 System.out.println("Speedup of Bicycle");
     }
	 public void applyBreaks() {
		 System.out.println("apply breaks of bicycle");
	 }
 }
  class bike implements vehicles
 {
	 public void GearChange() {
	  System.out.println("Gear Change of bike");
	  
	 }
	 public void Speedup() {
		 System.out.println("Speedup of Bike");
     }
	 public void applyBreaks() {
		 System.out.println("apply breaks of bike");
 }
  }
	 class car implements vehicles {
	 
	 public void GearChange() {
	  System.out.println("Gear Change of car");
	  
	 }
	 public void Speedup() {
		 System.out.println("Speedup of car");
     }
	 public void applyBreaks() {
		 System.out.println("apply breaks of car");
 }
 }
	 public class Interfaces 
	 {
		 public static void main(String args[])
		 {
			 vehicles v;
			 v=new bicycle();
			 v.GearChange();
	         v.Speedup();
	         v.applyBreaks();
			 
			  v=new bike();
			  v.GearChange();
	         v.Speedup();
	         v.applyBreaks();
			 
			  v=new car();
			  v.GearChange();
	         v.Speedup();
	         v.applyBreaks();
		 }
			 
		 }
/*	 
 Output:

Gear Change of bicycle
Speedup of Bicycle
apply breaks of bicycle
Gear Change of bike
Speedup of Bike
apply breaks of bike
Gear Change of car
Speedup of car
apply breaks of car


*/
 