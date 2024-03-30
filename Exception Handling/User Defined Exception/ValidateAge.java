class InvalidAgeException extends Exception
{
//Creating exception
InvalidAgeException(String s)
{
super(s);//passes the exception we get, to super class(the in built Exception class)
}
}
class TestThrow
{
static void validate(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("not valid");
}
else
{
throw new InvalidAgeException("welcome to the voting !");
}
}
}

class ValidateAge extends TestThrow
{
public static void main(String args[])
{
try
{
validate(30);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
