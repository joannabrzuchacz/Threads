package Nokia;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyCustomException {
        Convert convert =  new Convert();


        while (true) {

            System.out.println("Please provide me with the word: ");
            System.out.println("If you wish to end, please enter 'Q' ");
            Scanner input = new Scanner(System.in);
            String word = input.nextLine().toUpperCase();

            System.out.println(convert.encodeWithReduce(word));


        }

    }








}
