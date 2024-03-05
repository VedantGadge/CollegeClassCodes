import java.util.*;
public class Complex
{
int img,real;
void getData()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the real part of the complex number : ");
real=sc.nextInt();
System.out.print("Enter the imaginary part of the complex number: ");
img=sc.nextInt();
}
public static void main(String args[])
{
Complex ob1 = new Complex();
Complex ob2 = new Complex();
ob1.getData();
ob2.getData();
addComplex(ob1,ob2);
}

static void addComplex(Complex ob1,Complex ob2)
{
Complex ob3 = new Complex();
ob3.real = ob1.real + ob2.real;
ob3.img = ob1.img + ob2.img;
System.out.println("The first complex no. is "+ob1.real+"+"+ob1.img+"i");
System.out.println("The second complex no. is "+ob2.real+"+"+ob2.img+"i");
System.out.println("The sum of the complex nos. is "+ob3.real+"+"+ob3.img+"i");
}
}