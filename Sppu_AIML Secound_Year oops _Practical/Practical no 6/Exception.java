/*Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters two 
numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers, 
the program would throw a Number Format Exception. If Num2 were zero, the program would throw an 
Arithmetic Exception. Display the exception*/

import java.util.*;
public class Exception
{
	public static void main(String[]args)
	{
		try
		{
			int num1,num2,result;
			Scanner in= new Scanner(System.in);
			System.out.print("Enter First number :");
			num1=Integer.parseInt(in.next());
			System.out.print("Enter second number:");
			num2=Integer.parseInt(in.next());
			result=num1/num2;
			System.out.println("Division :"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominetor is Zero"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("input is Wrong"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is out of bound"+e);
		}
	}
}


/* 
Output :
Enter First number :35
Enter second number:0
Denominetor is Zerojava.lang.ArithmeticException: / by zero


Array Index Out of Bond :
Enter First number :10
Enter second number:5
Division :2
*/