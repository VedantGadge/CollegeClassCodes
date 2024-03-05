import java.util.*;
public class Exp4_a
{
public static void main(String args[])
{
Vector<String> v = new Vector<String>(5);
System.out.println("Enter the elements: ");
for(int i=0;i<v.capacity();i++)
{
v.addElement(args[i]);
}
System.out.println(v);
}
}
