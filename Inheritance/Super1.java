class Vehicle
{
int speed = 100;
}

class Super1 extends Vehicle
{
    int speed = 150;
    void display()
    {
        System.out.println(speed);
        System.out.println(super.speed); //super keyword is used to access the variables and methods of the parent class
    }
    public static void main(String[] args) 
    {
        Super1 obj = new Super1();
        obj.display();
    }
}