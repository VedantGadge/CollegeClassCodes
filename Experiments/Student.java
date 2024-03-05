import java.util.*;
public class Student
{
int id;
float p,c,m,total;
String name;
void getData()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name of the student: ");
name = sc.nextLine();
System.out.print("Enter the id of the student: ");
id = sc.nextInt();
System.out.print("Enter the physics marks of the student: ");
p = sc.nextFloat();
System.out.print("Enter the chemistry marks of the student: ");
c = sc.nextFloat();
System.out.print("Enter the mathematics marks of the student: ");
m = sc.nextFloat();
total = p+c+m;
System.out.println("The total marks of the student: "+total);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
System.out.print("Enter the number of students: ");
n=sc.nextInt();
Student s[]= new Student[n];
Student temp = new Student();
for(int i=0;i<s.length;i++)
{
s[i]=new Student();
s[i].getData();
}
for(int i=0;i<s.length;i++)
{
for(int j=i+1;j<s.length;j++)
if(s[i].total<s[j].total)
{
temp = s[i];
s[i]=s[j];
s[j]=temp;
}
}
System.out.println("The descending order is");
for(int i=0;i<s.length;i++)
{
System.out.println(s[i].name+" with total marks "+s[i].total);
}
}
}
