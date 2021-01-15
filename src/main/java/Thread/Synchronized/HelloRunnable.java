package Thread.Synchronized;

public class HelloRunnable implements Runnable {

    SecondThread secondThread = new SecondThread();

    public  void run() {

            System.out.println("Hello from a thread!");
            secondThread.printNumbers();
        }



}