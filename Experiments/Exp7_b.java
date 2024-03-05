class Exp7_b
{
int a,b,s;
Exp7_b(int x,int y)
{
a=x;
b=y;
System.out.println("The area of the square: "+a*b);
}
Exp7_b(int x)
{
s=x;
System.out.println("The area of the rectangle: "+s*s);
}
Exp7_b(Exp7_b ob3)
{
s=ob1.s;
System.out.println("The area of the square: "+s*s);
}

Exp7_b(Exp7_b ob4)
{

a=ob2.a;
b=ob2.b;
System.out.println("The area of the rectangle: "+a*b);
}
public static void main(String args[])
{
int area;
Exp7_b ob1 = new Exp7_b(5);
Exp7_b ob2 = new Exp7_b(5,10);
Exp7_b ob3 = new Exp7_b(ob1);
Exp7_b ob4 = new Exp7_b(ob2);

}
}

