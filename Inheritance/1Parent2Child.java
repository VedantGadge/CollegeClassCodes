class A
{
int a = 10;
}
class B extends A
{

}
class C extends A
{

}
class OneParent2Child
{
public static void main(String args[])
{
B ob1 = new B();
System.out.println("Inherited value of a from A to B : "+ob1.a);
C ob2 = new C();
System.out.println("Inherited value of a from A to B : "+ob2.a);
}
}