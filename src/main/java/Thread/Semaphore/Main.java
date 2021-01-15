package Thread.Semaphore;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        PrintingThread printer1 = new PrintingThread("Printer 1", printer);
        PrintingThread printer2 = new PrintingThread("Printer 2", printer);
        PrintingThread printer3 = new PrintingThread("Printer 3", printer);
        PrintingThread printer4 = new PrintingThread("Printer 4", printer);
        PrintingThread printer5 = new PrintingThread("Printer 5", printer);
        PrintingThread printer6 = new PrintingThread("Printer 6", printer);

        printer1.start();
        printer2.start();
        printer3.start();
        printer4.start();
        printer5.start();
        printer6.start();

    }
}
