import java.util.*;
class Demo{
static void display(int n)
{
System.out.println("Entered input: "+n);
}
protected void finalize()
{
    System.out.println("Now I have become god , The destroyer of worlds");
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
Demo ob1 = new Demo();
Demo ob2 = new Demo();
System.out.println("Enter an integer input: ");
int n = sc.nextInt();
ob1.display(n);
ob2.display(n+10);
ob1=null;
System.gc();
ob1.display(n);
}
}