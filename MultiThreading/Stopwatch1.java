import java.util.Scanner;

class PrintStopWatch extends Thread {
    volatile static int k = 0;
    int hr = 0, min = 0, sec = 0, centis = 0;

    public void run() {
        while (k != 1) {
            centis++;
            System.out.print("\r" + hr + "\t:\t" + min + "\t:\t" + sec + "\t:\t" + centis);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (centis == 100) {
                sec++;
                centis = 0;
            }
            if (sec == 60) {
                min++;
                sec = 0;
            }
            if (min == 60) {
                hr++;
                min = 0;
            }
        }
        System.out.println("\nStopwatch has been stopped!!");
    }
}

class EndStopWatch extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n Input 'e' to stop the stopwatch: ");
            char e = sc.next().charAt(0);
            if (e == 'e') {
                PrintStopWatch.k = 1;
                break;
            }
        }
    }
}

class StartStopWatch extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n Input 's' to start the stopwatch: ");
            char s = sc.next().charAt(0);
            if (s == 's') {
                synchronized (this) {
                    PrintStopWatch.k = 0;
                    notify();
                }
                break;
            }
        }
    }
}

public class Stopwatch1 {
    static volatile int s = 0;

    public static void main(String args[]) {
        PrintStopWatch s1 = new PrintStopWatch();
        EndStopWatch eS1 = new EndStopWatch();
        StartStopWatch s2 = new StartStopWatch();
        s2.start();

        synchronized (s2) {
            try {
                s2.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        s1.start();
        eS1.start();
    }
}
