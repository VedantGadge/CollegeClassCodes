import java.util.*;
public class Exp2_b
{
public static void main(String args[])
{
int n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
n=sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the element no. "+(i+1)+" : ");
arr[i] = sc.nextInt();
}
System.out.println("The new array is: ");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(j==i)
continue;
else
sum+=arr[j];
}
System.out.print(sum+" ");
sum=0;
}
}
}