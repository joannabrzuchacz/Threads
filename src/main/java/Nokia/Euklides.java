package Nokia;



import java.io.Console;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Euklides {

    public static void main(String[] args) {
//        int a = 9;
//        int b = 18;
//
//        while (a != b){
//            if (a > b)
//                //a = a-b
//                a -= b;
//            else
//                //b = b-a
//                b -= a;

        List<String> linkedList = new LinkedList<>();

        linkedList.add("tak");
        linkedList.add("nie");
        System.out.println(linkedList.size());
        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == "tak"){
                System.out.println("Tak!");
            }


        }
       // System.out.println(Euklides.reverseChar());

        }

       // System.out.println("Największy wspólny dzielnik (NWD) to: "+a);


    public static char[] reverseChar(){
        char[] arr = {'S', 'A', 'B', 'R', 'E'};

        for(int i = 0; i <= arr.length - 1; i++){
            //arr[i] = arr[arr.length - i];
            char letter = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1- i] = letter;
            System.out.println(arr);
        }

        return arr;
    }
}