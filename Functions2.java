import java.util.*;
public class Functions2
{
static int calculatePower(int a,int n)
{
int ans=1;
for(int i=1;i<=n;i++)
{
ans*=a;
}
return ans;
}
public static void main(String Args[])
{
int a,n,ans;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the integer and its power: ");
a=sc.nextInt();
n=sc.nextInt();
ans = calculatePower;
System.out.println("The result is: "+ans);
}
}

