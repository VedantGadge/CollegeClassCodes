import java.util.*;
public class Arrays_Sum
{
public static void main(String args[])
{
int n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
n = sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter the element no. "+(i+1)+" : ");
arr[i] = sc.nextInt();
}
for(int i=0;i<n;i++)
{
sum+=arr[i];
}
System.out.print("The sum of the elements of the arrays is "+sum);
}
}

