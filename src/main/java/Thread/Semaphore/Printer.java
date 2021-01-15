package Thread.Semaphore;

import java.util.concurrent.Semaphore;

public class Printer {


    private Semaphore semaphore = new Semaphore(2);

    public  void print() {
        try {
            semaphore.acquire();
            System.out.println(
                    System.currentTimeMillis() + " | Thread " + Thread.currentThread().getName() + " printing now.");
            Thread.sleep(1900);

            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
