class MultiT1 extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.print(i);
}
}
}
class MultiT2 extends Thread
{
public void run()
{
for(int j=5;j>=0;j--)
{
System.out.print("\n"+j);
}
}
}
public class MyThread1
{
public static void main(String args[])
{
MultiT1 t1 = new MultiT1();
t1.start();
MultiT2 t2 = new MultiT2();
t2.start();
}
}