    import java.util.*;
class MarksOutOfBoundsException extends Exception
{
    //Creating exception
    MarksOutOfBoundsException(String s)
    {
        super(s);
    }
}
class TestThrow 
{
        static void MarksCheck(float m) throws Exception
        {
            if((m>100)||(m<0))
            {
                throw new MarksOutOfBoundsException("Please enter valid marks!");
            }
        }
}


class ValidateMarks extends TestThrow
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        float m = sc.nextFloat();
        try
        {
            TestThrow.MarksCheck(m);
            System.out.println("Your inputted marks "+m+" are within valid range.");
        }
        catch(MarksOutOfBoundsException e)
        {
            System.out.println("Error message "+e);
        }
    }
}