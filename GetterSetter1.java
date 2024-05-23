public class GetterSetter1 
{
    String name;
    int age;
    GetterSetter1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    String getName()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }
    void setName(String name) //setters are used to update a value of the data in an object, once the object has been made
    {
        this.name=name;
    }
    void setAge(int age)
    {
        this.age=age;
    }

    public static void main(String[] args) 
    {
        GetterSetter1 person = new GetterSetter1("Vedant",18);
        System.out.println("The name of the person is: "+person.getName());
        System.out.println("The age of the person is: "+person.getAge());
        System.out.println("Updating the data...");
        person.setName("Devansh");//updating existing data stored in name
        person.setAge(13);//updating existing data stored in age
        System.out.println("The name of the person is: "+person.getName());
        System.out.println("The age of the person is: "+person.getAge());
    }
}
