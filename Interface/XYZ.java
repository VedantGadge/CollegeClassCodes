interface MyInterface
{
public void method1();
}
class XYZ implements MyInterface
{
public void method1()
{
System.out.println("implementation of method1");
}
public static void main(String args[])
{
MyInterface obj = new XYZ(); //Dynamic method dispatch(Reference Method)
obj.method1();
}
}
