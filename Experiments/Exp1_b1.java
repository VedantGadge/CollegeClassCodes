import java.util.*;
class Exp1_b1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("Enter 1st number: ");
a = sc.nextInt();
System.out.println("Enter 2nd number: ");
b = sc.nextInt();
System.out.println("Enter 3rd number: ");
c = sc.nextInt();

if(a>b)
{
if(a>c)
System.out.println(a+" is the largest number");
else
System.out.println(c+" is the largest number");
}
else
{
if(b>c)
System.out.println(b+" is the largest number");
else
System.out.println(c+" is the largest number");
}
}
}
