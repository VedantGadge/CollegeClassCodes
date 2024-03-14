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

/*
 We cannot create object inside an abstract classes and interfaces.
 So we make an object of an abstract class or an interface(obv outseide them), we use 
 the objects of it's child class as a refernce object.So this is called as Dynamic method dispatch.
 This is an application of dynamic polymorphism.
 */
