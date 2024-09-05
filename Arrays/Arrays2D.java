import java.util.*;
public class Arrays2D
{
public static void main(String args[])
{
int r,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the rows of the array: ");
r = sc.nextInt();
System.out.println("Enter the columns of the array: ");
c = sc.nextInt();
int[][] arr= new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print("Enter the element no. "+(i+1)+(j+1)+" : ");
arr[i][j] = sc.nextInt();
}
}
System.out.println("The new arrays is: ");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}


