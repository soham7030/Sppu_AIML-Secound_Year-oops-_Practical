import java.util.*;
class Complex_Op
{
float real,imag;
Complex_Op()
{
real=0;
imag=0;
}
Complex_Op(float Comp1,float Comp2)
{
real=Comp1;
imag=Comp2;
}
void AddNumbers(Complex_Op C1 ,Complex_Op C2)
{
float real,imag;
real = (C1.real + C2.real);
imag = (C1.imag + C2.imag);
System.out.println("Answer is:("+real+") + ("+imag+")i" );
}
}
public class Complex
{
public static void main(String args[]) {
int ch=0;
float num1, num2, answer;
Complex_Op cal = new Complex_Op () ;
Scanner input = new Scanner(System.in);
System.out.print("Enter the real and imaginary part of first no.\n");
num1 = input.nextInt();
num2 = input.nextInt();
Complex_Op Object1 = new Complex_Op(num1,num2);
System.out.print("Enter the real and imaginary part of Second Number\n");
num1 = input.nextInt();
num2 = input.nextInt();
Complex_Op Object2 = new Complex_Op(num1,num2);
cal.AddNumbers(Object1,Object2);
}
}


/*OUTPUT:

/*Enter the real and imaginary part of first no.
45
45
Enter the real and imaginary part of Second Number
78
97
Answer is:(123.0) + (142.0)i

*/