class MultipleCatch
{
public static void main(String Args[])
{
int a[]=new int[5];
a[1]=10;
try 
{
a[7]=55;
a[5]= 30/0;
a[3]=55;
}
catch(ArithmeticException e)
{
System.out.println("Dividing by 0 !");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Arrays index out of bounds !");
}
System.out.println(a[3]);
}
}

//try returns only ONE object, and terminates its execution as soon it encounters an exception.Thus only we need to write only that statements where we expect exceptions.So a try will throw only one exception(as it returns only one exception object).
/*
try 
{
a[5]= 30/0;
a[3]=55;
}
/*
//In the above eg, as termination starts from the right, it encounters the divide by 0 error first and throws towards the ArithmeticException.
//Try SHOULD be followed by a catch block.We cannot write try try catch catch..
/*
try 
{
a[7]=55;
a[5]= 30/0;
a[3]=55;
}
*/
//Also in the above eg, as the execution of the try block stops at first line, a[3] doesnt get the 5 value, and will show 0 on printing a[0].