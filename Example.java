import java.util.Scanner;
class Example
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();
		c=a+b;
		System.out.println("Addition is: "+c);
	}
}