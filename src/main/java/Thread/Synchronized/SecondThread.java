package Thread.Synchronized;

public class SecondThread  {

    public synchronized void printNumbers(){
        for (int x = 0; x < 15; x++) {
            System.out.println(x);

        }
    }

}
