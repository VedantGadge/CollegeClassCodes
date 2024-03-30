class Catch2
{
public static void main(String args[])
{

try
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = a/b;
}

catch(ArithmeticException e)
{
System.out.println("Dividing by 0 !");
}

catch(NumberFormatException e)
{
System.out.println("Please enter an Integer !!") ;
}

System.out.println("Program executed properly!");
}
}