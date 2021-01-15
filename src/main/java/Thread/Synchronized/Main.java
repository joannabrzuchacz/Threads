package Thread.Synchronized;

public class Main {


    public static void main(String[] args) throws InterruptedException {
//        HelloRunnable helloRunnable = new HelloRunnable();
//
//
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                helloRunnable.secondThread.printNumbers();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                helloRunnable.secondThread.printNumbers();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//    }


        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<1000; i++)
                    counter.incr();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<1000; i++)
                    counter.incr();
            }
        });


        t1.start();
        t2.start();



        t1.join();
        t2.join();

        System.out.println("Count = " + counter.count);
    }
}


