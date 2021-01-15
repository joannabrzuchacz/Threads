package Code;

public class Bob {
    public static int enough(int cap, int on, int wait){
        int currentCap = cap - on;
        if (currentCap - wait < 0){
            return (currentCap - wait) * (-1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Bob.enough(100, 60, 50));

    }
}
