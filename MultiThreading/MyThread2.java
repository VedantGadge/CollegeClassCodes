class MyThread2A extends Thread
{
public void run()
{
for(int i = 0;i<=10;i++)
{
if(i==2)
MyThread2A.yield();
System.out.println("Running Thread A: "+i);
}
System.out.println("Exit from thread A");
}
}

class MyThread2B extends Thread
{
public void run()
{
for(int i = 0;i<=10;i++)
{
if(i==3)
stop();
System.out.println("Running Thread B: "+i);
}
System.out.println("Exit from thread B");
}
}


class MyThread2C extends Thread
{
public void run()
{
System.out.println("Running Thread C: "+i);
for(int i = 0;i<=10;i++)
{
if(i==2)
try
{ sleep(5000);}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Exit from thread C");
}
}
}
public class Mythread2
{
public static void main()
{
MyThread2A t1 = new MyThread2A();
MyThread2B t2 = new MyThread2B();
MyThread2C t3 = new MyThread2C();
t1.start();
t2.start();
t3.start();
}
}
