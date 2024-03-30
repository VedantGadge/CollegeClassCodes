import java.util.*;
class Strings4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s;
char c;
int ctr=0;
System.out.println("Enter a string: ");
s=sc.nextLine();
System.out.println("Enter a character: ");
c=sc.next().charAt(0);
for(int j=0;j<s.length();j++)
{
if(c==s.charAt(j))
ctr++;
else
continue;
}
System.out.println("The frequency of "+c+" : "+ctr);
}
}