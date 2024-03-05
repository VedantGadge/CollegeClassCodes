import java.util.*;
class Exp1_b2
{
public static void main(String args[])
{
int a,b,c,g;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
a = sc.nextInt();
System.out.println("Enter 2nd number: ");
b = sc.nextInt();
System.out.println("Enter 3rd number: ");
c = sc.nextInt();
g=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("The largest number is: "+g);
}
}
