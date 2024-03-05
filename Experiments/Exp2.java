import java.util.*;
public class Exp2_a
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
sum+=arr[j];
}
System.out.print(sum-arr[i]+" ");
sum=0;
}
}
}

