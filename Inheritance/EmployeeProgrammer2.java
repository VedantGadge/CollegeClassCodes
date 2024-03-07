class Employee extends Programmer
{
float salary = 40000;
}
class Programmer 
{
int bonus = 10000;
}
class EmployeeProgrammer2
{
public static void main(String args[])
{
Employee e = new Employee();
System.out.println("Programmer salary is: "+e.salary);
System.out.println("Bonus salary is: "+e.bonus);
}
}
