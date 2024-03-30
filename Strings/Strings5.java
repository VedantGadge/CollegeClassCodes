import java.util.*;
class Strings5
{
public static void main(String Args[])
{
String s,temp;
s = temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter String: ");
s = sc.nextLine();
for(int i = 0;i<=(s.length()/2);i++)
{
s.charAt(i)=sc.charAt(s.length()-i);
}
if(s==temp)
System.out.println("Palindrome!!");
else
System.out.println("Not Palindrome!!");
}
}





