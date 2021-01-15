package Thread.Synchronized;

public class Counter{
    public int count;

    public synchronized   void incr()
    {
        count++;
    }

}