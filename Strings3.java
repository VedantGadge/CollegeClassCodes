import java.util.*;
class Strings3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s;
int l=0,d=0,u=0,spc=0,special_c=0,c,;
System.out.println("Enter a string: ");
s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
c=s.charAt(i);
if(c>='a'&&c<='z')
l++;
else if(c>='A'&&c<='Z')
u++;
else if(c==' ')
spc++;
else if(c>=0&&c<=9)
d++;
else
special_c++;
}
System.out.println("No. of lower case letters are: "+l);
System.out.println("No. of upper case letters are: "+u);
System.out.println("No. of spaces are: "+spc);
System.out.println("No. of special characters are: "+special_c);
}
}

