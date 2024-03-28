class Sample
{
public static void main(String args[])
{
int a = 10;
int b = 5;
int c = 5;
try
{
int x = a/(b-c);
System.out.println(x);
}
catch(ArithmeticException e)
{
 System.out.println("Dividing by zero");
}
int y=a+b+c;
System.out.println(y);
}
}

//By using try catch n all we dont solve the exception or anything we just handle it.