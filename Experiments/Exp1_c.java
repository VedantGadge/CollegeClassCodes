class Exp1_c
{
public static void main(String args[])
{
int a,len=0;
a=Integer.parseInt(args[0]);
while(a!=0)
{
a=a/10;
len++;
}
System.out.println("The length of the number is: "+len);
}
}