import java.util.*;
public class Exp5_b
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter 1 to calculate area of square");
System.out.println("Enter 2 to calculate area of rectangle");
n=sc.nextInt();
if(n==1)
{
System.out.print("Enter the side of the square");
int a = sc.nextInt();
calcArea(a);
}
if(n==2)
{
System.out.print("Enter the length of the rectangle: ");
int l=sc.nextInt();
System.out.print("Enter the breadth of the rectangle: ");
int b = sc.nextInt();
calcArea(l,b);
}
}
static void calcArea(int a)
{
int area = a*a;
System.out.println("The area of the square is: "+area);
}
static void calcArea(int l,int b)
{
int area = l*b;
System.out.println("The area of the rectangle is: "+area);
}
}