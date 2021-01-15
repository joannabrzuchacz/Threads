package Exceptions;

import java.util.Arrays;
import java.util.Collections;

public class Rotator {

    public static Object[] rotate(Object[] data, int n) {
            Collections.rotate(Arrays.asList(data), n);
            return data;
        }

    public static String HQ9(char code) {
        String lyrics = "Tak";

        int i = 2;
        double square = Math.pow(i, 2);

        switch (code) {
            case 'H':
                return "Hello Wordl!";
            case 'Q':
                return "Q";
            case '9':
                return lyrics;
        }
        return null;

    }

    public static String bmi(double weight, double height) {
        double division = weight / height;
        double BMI = Math.pow(division, 2);
        if(BMI <= 18.5) return "Underweight";
        else if(BMI <= 25) return "Normal";
        else if(BMI <= 30.0) return "Overweight";
        else if(BMI > 30) return "Obese";
        return null;
    }

    public static String makeComplement(String dna) {
        String[] separateDNA = dna.split("");
        String result = "";

        for (String element : separateDNA){
            switch (element){
                case "T" :
                    result += "A";
                    break;
                case "A" :
                    result += "T";
                    break;
                case "G" :
                    result += "C";
                    break;
                case "C" :
                    result += "G";
                    break;
            }
        }
        return result;
    }

    public static boolean solution(String str, String ending) {
        String[] endingChars = ending.split("");
        int endingCharsLength = endingChars.length;
        String[] splittedString = str.split("");
        int indexFromString = str.length() - endingCharsLength;
        String[] subarray = subArray(splittedString, indexFromString, str.length() - 1);

        String combineString = String.join("", subarray);


        if(combineString.equals(ending)){
            return true;
        }else {
            return false;
        }
    }

    public static<T> T[] subArray(T[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }

    public static void main(String[] args) {
        solution("attempt", "pt");
    }
}
