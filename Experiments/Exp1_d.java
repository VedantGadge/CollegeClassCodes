import java.util.*;
public class Exp1_d
{
public static void main(String Args[])
{
int a,b,n;
float res;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st number: ");
a = sc.nextInt();
System.out.println("Enter the 2nd number: ");
b = sc.nextInt();
System.out.println("Enter 1 for Addition ");
System.out.println("Enter 2 for Subtraction ");
System.out.println("Enter 3 for Multiplication ");
System.out.println("Enter 4 for division ");
n = sc.nextInt();

switch(n)
{
case 1:
res = a+b;
System.out.println("The addition of "+a+" and "+b+" is "+res);
break;
case 2:
res = a-b;
System.out.println("The difference between "+a+" and "+b+" is "+res);
break;
case 3:
res = a*b;
System.out.println("The multiplication of "+a+" and "+b+" is "+res);
break;
case 4:
res = a/b;
System.out.println("The division of "+a+" and "+b+" is "+res);
break;
default:
System.out.println("Enter a valid option!!");
break;
}
}
}