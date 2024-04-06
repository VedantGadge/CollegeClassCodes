import java.util.*;

class printStopWatch extends Thread
    {
        static int k=0;
        public void print()
        {
            while(k!=1)
            {
                    int hr=0,min=0,sec=0;
                    for(sec=1;sec>=0;sec++)
                    {
                        System.out.println(hr+"\t:\t"+min+"\t:\t"+sec);
                        try
                        {
                            Thread.sleep(1000);
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }
                        if(sec==60)
                        {
                            min++;
                            sec=0;
                        }
                        if(min==60)
                        {
                            hr++;
                            min=0;
                        }
                    }
                
            }
        }
    }

class endStopWatch
{

    static void M1()
    {
        char es='a';
        printStopWatch pS = new printStopWatch();
        Scanner sc= new Scanner(System.in);
        char e = sc.next().charAt(0);
        if(es=='e')
        {
            pS.k=1;
        }
        
    }
}
public class Stopwatch extends Thread
{
    public static void main(String args[])
    {
        printStopWatch s1 = new printStopWatch();
        endStopWatch eS1 = new endStopWatch();
        s1.print();
        eS1.M1();

    }
}
//make the print and endStopwatch method run at the same time