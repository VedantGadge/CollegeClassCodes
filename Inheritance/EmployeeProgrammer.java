class Employee
{
float salary = 40000;
}
class Programmer extends Employee
{
int bonus = 10000;
}
class EmployeeProgrammer //File is named after the class in which we make the main().
{
public static void main(String args[])
{
Programmer p = new Programmer();
System.out.println("Programmer salary is: "+p.salary);
System.out.println("Bonus salary is: "+p.bonus);
}
}
