class Person
{
    void work()
    {
        System.out.println("working");
    }
}

class Teacher extends Person
{
    void work()
    {
        System.out.println("TEacher teaches");
    }
}

class Student extends Teacher{
    void work()
    {
        System.out.println("Student studies");
    }
}


public class d2{
    public static void main(String[] args) {
        Person t;
        t.work();
        Person s =new Student();
        s.work();
        Person p = new Person();
        p.work();
    }
}
