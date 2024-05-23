interface NameSetter
{
    void NameSet();
}

interface AgeSetter
{
     void AgeSet();
}

public class MultipleInterface implements NameSetter,AgeSetter
{
    static String name;
    static int age;
    public void NameSet()
    {
        this.name="Vedant";
    }
    public void AgeSet()
    {
        this.age=18;
    }
    public static void main(String[] args) {
        MultipleInterface Person = new MultipleInterface();
        Person.AgeSet();
        Person.NameSet();
        System.out.println(Person.name+" "+Person.age);
    }
}
