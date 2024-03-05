class Exp7_a
{
static int count=0; //need to write static, else while creating a new object,the count value will again set to 0 and get increment to 1
public  Exp7_a()
{
count++;
}
public static void main(String Args[])
{
Exp7_a c1 = new Exp7_a();
Exp7_a c2 = new Exp7_a();
Exp7_a c3 = new Exp7_a();
System.out.println("The no. of objects of the class is: "+count);
}
}