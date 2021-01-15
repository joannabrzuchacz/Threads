package Exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Give me a number");
//        Scanner input = new Scanner(System.in);
//        double inputUser = 0;
//
//        while (true){
//            try {
//                inputUser = input.nextDouble();
//                break;
//            }catch (InputMismatchException exception){
//                System.out.println("This is not a number!");
//                input.next();
//            }
//        }
//        if (inputUser < 0) {
//            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby rzeczywistej %.0f nie istnieje!", inputUser));
//        }
//
//        System.out.print(String.format("Pierwieastek z %.0f to %.0f.", inputUser, Math.sqrt(inputUser)));

        System.out.println(Main.testing("null"));
    }

    public static String testing(String initial) {

        if (initial == null) {
            return "";
        }
        if (initial.equals(null)) {
            return "";
        }
        String result = "";
        String[] splittedWord = initial.split("");

        for (int x = 0; x < initial.length(); x++) {
            if (splittedWord[x].equals("h") | splittedWord[x].equals("t") | splittedWord[x].equals("b") | splittedWord[x].equals("H") | splittedWord[x].equals("T") | splittedWord[x].equals("B")) {
                result += splittedWord[x];
            }
        }
        return result;
    }


}
