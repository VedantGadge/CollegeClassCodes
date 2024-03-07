class Vehicle
{
Vehicle()
{
System.out.println("Vehicle is created.");
}
}
class Bike1 extends Vehicle
{
Bike1()
{
super(); //this calls the constructor function of the super class/parent class
System.out.println("Bike1 is created.");
}
public static void main(String Args[])
{
Bike1 ob = new Bike1();
}
}