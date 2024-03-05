class Exp7_a
{
static int count=0;
public  Exp7_a()
{
count++;
}
public static void main(String Args[])
{
Exp5_d c1 = new Exp7_a();
Exp5_d c2 = new Exp7_a();
Exp5_d c3 = new Exp7_a();
System.out.println("The no. of objects of the class is: "+count);
}
}