/*Design a base class shape with two double type values and member functions to input the data
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. 
Make compute_area() as abstract function and redefine this function in the derived class to suit 
their requirements. Write a program that accepts dimensions of triangle/rectangle and display 
calculatedarea. Implement dynamic binding for given case study. */
import java.util.Scanner;

abstract class  Shape
{
	Double val1,val2;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no ");
		val1=sc.nextDouble();
		System.out.println("Enter Secound no ");
		val2=sc.nextDouble();
		
	}
	
	 abstract void compute_area();
	

}

class triangle extends Shape
{
	
	 void compute_area(){
	 double area;
	area=1.0f/2.0f*val1*val2;
     System.out.println("area of triangle is"+area);	 
	}
	
}  
  
  class rectangle extends Shape
{
	 void compute_area(){
		double area;
     area=val1*val2;	
	System.out.println("area of rectangle is"+area);	 
	
	 }
	
}  

public class Dynamic 
{
	public static void main(String args[])
	{
	 Shape s;
	 
	 triangle t=new triangle();
	 rectangle r=new rectangle();
	 
	 s=t;
	 s.input();
	 s.compute_area();
	 
	 s=r;
         s.input();
         s.compute_area();
	}
	
	
}




/*Output:


Enter First no
34
Enter Secound no
33
area of triangle is 561.0
Enter First no
53
Enter Secound no
32
area of rectangle is 1696.0
 
*/	