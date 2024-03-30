//COPY CONSTRUCTOR & CONSTRUCTOR OVERLOADING
public class Constructor3
{
int a,b;
Constructor3(int x,int y)
{
a=x;
b=y;
System.out.println("A = "+a+" B = "+b);
}
Constructor3(Constructor3 obj1)
{
a=obj1.b;
b=obj1.a;
System.out.println("A = "+a+" B = "+b);
}
public static void main(String args[])
{
Constructor3 obj2 = new Constructor3(100,50);
Constructor3 obj3 = new Constructor3(obj2);
}
}