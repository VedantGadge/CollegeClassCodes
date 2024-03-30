//PARAMETERIZED CONSTRUCTOR
public class Constructor2
{
int a,b;
Constructor2(int x, int y)
{
a=x;
b=y;
}

int Add()
{
return a+b;
}
public static void main(String args[])
{
int sum;
Constructor2 obj = new Constructor2(5,10);
sum=obj.Add();
System.out.println("The sum of the two numbers is: "+sum);
}
}