import java.util.*;
public class Exp1_e1
{
public static void main(String Args[])
{
Scanner sc = new Scanner(System.in);
int marks;
System.out.println("Enter your total mean marks out of 100");
marks= sc.nextInt();

if((0<=marks)&&(marks<=40))
{
System.out.println("You have F grade, JUST PASS!!");
}
else if((50<=marks)&&(marks<=60))
{
System.out.println("You have E grade");
}
else if((60<=marks)&&(marks<=70))
{
System.out.println("You have D grade");
}
else if((70<=marks)&&(marks<=80))
{
System.out.println("You have C grade");
}
else if((80<=marks)&&(marks<=90))
{
System.out.println("You have B grade");
}
else if((90<=marks)&&(marks<=100))
{
System.out.println("You have A grade, WELL DONE!!");
}
else
{
System.out.println("Please enter appropriate marks!!");
}
}
}



