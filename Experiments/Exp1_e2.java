import java.util.*;
public class Exp1_e2
{
public static void main(String Args[])
{
Scanner sc = new Scanner(System.in);
int marks;
System.out.println("Enter your total mean marks out of 100");
marks= sc.nextInt();
if((0<=marks)&&(marks<100))
{
marks/=10;
switch(marks)
{
case 1:
System.out.println("Grade: F");
break;
case 2:
System.out.println("Grade: F");
break;
case 3:
System.out.println("Grade: F");
break;
case 4:
System.out.println("Grade: E");
break;
case 5:
System.out.println("Grade: D");
break;
case 6:
System.out.println("Grade: C");
break;
case 7:
System.out.println("Grade: B");
break;
case 8:
System.out.println("Grade: A");
break;
case 9:
System.out.println("Grade: A");
break;
default:
System.out.println("Enter valid marks");
break;
}
}
else
{
System.out.println("Enter valid marks");
}
}
}
