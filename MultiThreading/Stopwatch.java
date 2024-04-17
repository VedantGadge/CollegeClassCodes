import java.util.*;

class printStopWatch extends Thread
    {
        volatile static int k=0;
        int hr=0,min=0,sec=0,centis=0;
        public void run()
        {
            while(k!=1)
            {
                centis++;
                System.out.print("\r"+hr+"\t:\t"+min+"\t:\t"+sec+"\t:\t"+centis);
                        
                try
                    {
                        Thread.sleep(10);
                    }
                catch(Exception e)
                     {
                        System.out.println(e);
                    }
                    if(centis==60)
                    {
                        sec++;
                        centis=0;
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
            System.out.println("Stopwatch has been stopped!!");
        }
    }

class endStopWatch extends Thread
{

    public void run()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.println("\n Input e to stop the stopwatch: ");
            char e = sc.next().charAt(0);
            if(e=='e')
            {
                printStopWatch.k=1;
                break;
            }
        }
        
    }
}
class startStopWatch extends Thread
{

    public void run()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            System.out.print("\n Input s to start the stopwatch: ");
            char e = sc.next().charAt(0);
            if(e=='s')
            {
                Stopwatch.s=1;
                break;
            }
        }
        
    }
}
public class Stopwatch extends Thread
{
    static int s = 0;
    public static void main(String args[])
    {
        printStopWatch s1 = new printStopWatch();
        endStopWatch eS1 = new endStopWatch();
        startStopWatch s2 = new startStopWatch();
        s2.start();
        while (true) {
            if (Stopwatch.s == 1) {
                s1.start();
                eS1.start();
                break;
            }
        
        }
    }
}
