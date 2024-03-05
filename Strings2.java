import java.util.*;
class Strings2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s;
char c;
System.out.println("Enter a string: ");
s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
c = s.charAt(i);
System.out.println(c);
}
}
}