package Thread.Semaphore;

class PrintingThread extends Thread {

    private Printer printer;

    public PrintingThread(String name, Printer printer) {
        this.setName(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print();
    }
}