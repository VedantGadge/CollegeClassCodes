class Nested_Try
{
public static void main(String args[])
{
int a[] = new int[5];
try
{
try
{
a[6] = 5/0;

}
catch(ArithmeticException e)
{
System.out.println("Dividing by 0!");
}
a[1] = 10;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of bounds !");
}
}
}
