class Exp5_d
{
static int count=0;
static void counter()
{
count++;
}
public static void main(String Args[])
{
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();
c1.counter();
System.out.println(count);
c2.counter();
System.out.println(count);
c3.counter();
System.out.println(count);
System.out.println("The no. of objects of the class is 3 ")
}
}