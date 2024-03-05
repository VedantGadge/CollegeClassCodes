import java.util.*;
public class Arrays1
{
public static void main(String args[])
{
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
n = sc.nextInt();
int[] arr= new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter the element no. "+(i+1)+" : ");
arr[i] = sc.nextInt();
}
System.out.print("Elements are: ");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
}
}
