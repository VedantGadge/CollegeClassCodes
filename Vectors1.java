import java.util.*;
public class Vectors1
{
public static void main(String args[])
{
Vector<Integer> v = new Vector<Integer>(5);
Scanner sc = new Scanner(System.in);
for(int i=0;i<v.capacity();i++)
{
v.addElement(sc.nextInt());
}
System.out.println(v);
for(int i=0;i<v.capacity();i++)
{
System.out.print(v.get(i)+" ");
}
}
}
