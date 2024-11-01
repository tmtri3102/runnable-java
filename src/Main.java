import java.lang.Thread;
import java.lang.Runnable;
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database"); // Creating Thread-1-HR-Database after "new" construction
        runnableDemo1.start(); // run() ngay sau khi start()??

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}