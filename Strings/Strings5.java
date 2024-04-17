import java.util.*;
class Strings5
{
public static void main(String Args[])
{
String s;
int k=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
s = sc.nextLine();
for(int i = 0;i<=(s.length()/2);i++)
{
if(s.charAt(i)!=s.charAt(s.length()-1-i))
    k=1;
}
if(k==1)
System.out.println("Not Palindrome!!");
else
System.out.println("Palindrome!!");
}
}






