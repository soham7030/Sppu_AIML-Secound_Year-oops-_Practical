/*Identify commonalities and differences between Publication, Book and magazine classes. Title, 
Price, Copies are common instance variables and saleCopy is common method. The differences 
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, 
receiveissue().Write a program to find how many copies of the given books are ordered and 
display total sale of publication.*/

import java.util.Scanner;  //Scanner Class 
import java.util.*;
class Publication
{
	String Title;//instance variables
	int price,copies;//instance variables
	void saleCopy()//common method 
	{
		
	}
	
}
class Book
{
	String Title,author;
	int price,copies;
	void saleCopy() //common method
	{
	  price=150;
	  System.out.println("Total Sale Of Book : "+copies*price);
	  
	}
	void orderCopies() //method 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Book Of Copies");
		copies=sc.nextInt();//stored the data 
	}
	
}

class Magazine
{
	String Title;
	int copies,price;
	void saleCopy()
	{
		price=450;
		System.out.println("Total Sale Of Magazine "+copies*price);
	}
	void orderQty()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Magazine Copies");
		copies=sc.nextInt();
	}
	
	void Currentissue()
	{
		System.out.println("Order Sucessfully!!"+"You have Orderd :"+copies+"copies");
	}
    void receiveissue()
	{
		System.out.println("Orederd Dispached In Two Days!!");
	}
	
	}
   
   class PublicationTest
   {
	   public static void main(String args[])
	   {
		   Book b=new Book(); //create the objects
		  
		   b.orderCopies();
		  b.saleCopy();  
		  
		   
		   Magazine m=new Magazine();
		   
		  m.orderQty();
		  
		   m.Currentissue();
		   m.receiveissue();
		 m.saleCopy();
	   }
   }


/*

Output:
Enter The Book Of Copies
35
Total Sale Of Book : 5250
Enter The Magazine Copies

35
Order Sucessfully!!You have Orderd :35copies
Orederd Dispached In Two Days!!
Total Sale Of Magazine 15750

*/


