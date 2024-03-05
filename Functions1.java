import java.util.*;
public class Functions1
{
static int calculateArea(int l,int b)
{
int area = l*b;
return area;
}
public static void main(String Args[])
{
int l,b,Area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the integer value of length: ");
l=sc.nextInt();
System.out.println("Enter the integer value of breadth: ");
b=sc.nextInt();
Area = calculateArea(l,b);
System.out.println("Area of the rctangle is: "+Area);
}
}
