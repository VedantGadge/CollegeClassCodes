import java.util.*;
public class Exp4_b
{
public static void main(String args[])
{
int n,c=0;
String s;
Vector<String> v = new Vector<String>();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no. of strings: ");
n=sc.nextInt();
System.out.println("Enter the strings: ");
for(int i=0;i<n;i++)
{
v.addElement(sc.next());
}
System.out.println(v);
System.out.println("Enter the strings to check: ");
s=sc.next();
for(int i=0;i<n;i++)
{
if(s==v.get(i))
c=i;
else
continue;
}
if(c!=0)
v.removeElementAt(c);
else
v.addElement(s);
System.out.print(v);
}
}


