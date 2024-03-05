public class Exp1_g2
{
public static void main(String Args[])
{
int ch = 65,n=5,temp=ch;
for(int i = 1;i<n;i++)
{
for(int k = 1;k<=(n-i);k++)
{
System.out.print(" ");
}
if(i%2==0){
for(int j = 1;j<=i;j++)
{
ch = temp;
System.out.print((char)(temp+i));
temp--;
}
}
else if(i==1){
for(int j = 1;j<=i;j++)
{
System.out.print((char)(ch));
ch++;
}
}
else {
for(int j = 1;j<=i;j++)
{
System.out.print((char)(ch+i));
ch--;
}
}
System.out.println();
}
}
}



